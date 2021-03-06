/*
 * Created on 5 Sep 2017 ( Time 14:30:03 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package com.nmac.payments.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nmac.payments.entities.NmacPymnts;
import com.nmac.payments.exceptions.NmacPymntsNotFoundException;
import com.nmac.payments.repository.NmacPymntsRepository;

@Service
@Transactional(rollbackFor=NmacPymntsNotFoundException.class)
public class NmacPymntsService 
{
	private static Logger logger = LoggerFactory.getLogger(NmacPymntsService.class);
	
	@Autowired
	private NmacPymntsRepository nmacpymntsRepository;
		
	/*
	 * READ methods
	 */
	public Page<NmacPymnts> findAll(int page, int count) {
		
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntsService -> findAll NmacPymntss");
		
		return nmacpymntsRepository.findAll(new PageRequest(page, count));
	}

	public Iterable<NmacPymnts> findAll() {
		
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntsService -> findAll NmacPymntss");
		
		return nmacpymntsRepository.findAll();
	}
/*
	public NmacPymnts findBySfid(String nmacpymnts){
		if (logger.isDebugEnabled())
			logger.debug("Retrieving NmacPymnts with sfid:" + nmacpymnts);
		
		return nmacpymntsRepository.findBySfid(nmacpymnts);
		
	}
*/
	public NmacPymnts get(int id) {
		if (logger.isDebugEnabled())
			logger.debug("Retrieving NmacPymnts with id:" + id);
		
		NmacPymnts elementToGet = nmacpymntsRepository.findOne(id);
		
		if (elementToGet == null)
			throw new NmacPymntsNotFoundException(id);
		
		return elementToGet;
	}

	public NmacPymnts create(NmacPymnts nmacpymnts) {

		if (logger.isDebugEnabled())
			logger.debug("NmacPymntsService -> create:" + nmacpymnts);
			
		return nmacpymntsRepository.save(nmacpymnts);
	}

	public NmacPymnts update(NmacPymnts nmacpymnts) {
		
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntsService -> create:" + nmacpymnts);

		NmacPymnts elementToUpdate = nmacpymntsRepository.findOne(nmacpymnts.getId());
		
		if (elementToUpdate == null)
			throw new NmacPymntsNotFoundException(nmacpymnts.getAmTypNm());
		
		elementToUpdate.update(nmacpymnts);
		nmacpymntsRepository.save(elementToUpdate);
		
		return elementToUpdate;
	}

	public NmacPymnts delete(int id) {
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntsService -> delete:" + id);

		NmacPymnts elementToDelete = get(id);
		
		if (elementToDelete == null)
			throw new NmacPymntsNotFoundException(id);
		
		nmacpymntsRepository.delete(elementToDelete);

		return elementToDelete;
	}

}

