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

import com.nmac.payments.entities.NmacPymntsHs;
import com.nmac.payments.exceptions.NmacPymntsHsNotFoundException;
import com.nmac.payments.repository.NmacPymntsHsRepository;

@Service
@Transactional(rollbackFor=NmacPymntsHsNotFoundException.class)
public class NmacPymntsHsService 
{
	private static Logger logger = LoggerFactory.getLogger(NmacPymntsHsService.class);
	
	@Autowired
	private NmacPymntsHsRepository nmacpymntshsRepository;
		
	/*
	 * READ methods
	 */
	public Page<NmacPymntsHs> findAll(int page, int count) {
		
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntsHsService -> findAll NmacPymntsHss");
		
		return nmacpymntshsRepository.findAll(new PageRequest(page, count));
	}

	public Iterable<NmacPymntsHs> findAll() {
		
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntsHsService -> findAll NmacPymntsHss");
		
		return nmacpymntshsRepository.findAll();
	}
/*
	public NmacPymntsHs findBySfid(String nmacpymntshs){
		if (logger.isDebugEnabled())
			logger.debug("Retrieving NmacPymntsHs with sfid:" + nmacpymntshs);
		
		return nmacpymntshsRepository.findBySfid(nmacpymntshs);
		
	}
*/
	public NmacPymntsHs get(int id) {
		if (logger.isDebugEnabled())
			logger.debug("Retrieving NmacPymntsHs with id:" + id);
		
		NmacPymntsHs elementToGet = nmacpymntshsRepository.findOne(id);
		
		if (elementToGet == null)
			throw new NmacPymntsHsNotFoundException(id);
		
		return elementToGet;
	}

	public NmacPymntsHs create(NmacPymntsHs nmacpymntshs) {

		if (logger.isDebugEnabled())
			logger.debug("NmacPymntsHsService -> create:" + nmacpymntshs);
			
		return nmacpymntshsRepository.save(nmacpymntshs);
	}

	public NmacPymntsHs update(NmacPymntsHs nmacpymntshs) {
		
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntsHsService -> create:" + nmacpymntshs);

		NmacPymntsHs elementToUpdate = nmacpymntshsRepository.findOne(nmacpymntshs.getId());
		
		if (elementToUpdate == null)
			throw new NmacPymntsHsNotFoundException(nmacpymntshs.getAmTypNm());
		
		elementToUpdate.update(nmacpymntshs);
		nmacpymntshsRepository.save(elementToUpdate);
		
		return elementToUpdate;
	}

	public NmacPymntsHs delete(int id) {
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntsHsService -> delete:" + id);

		NmacPymntsHs elementToDelete = get(id);
		
		if (elementToDelete == null)
			throw new NmacPymntsHsNotFoundException(id);
		
		nmacpymntshsRepository.delete(elementToDelete);

		return elementToDelete;
	}

}

