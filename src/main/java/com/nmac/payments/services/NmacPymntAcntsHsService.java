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

import com.nmac.payments.entities.NmacPymntAcntsHs;
import com.nmac.payments.exceptions.NmacPymntAcntsHsNotFoundException;
import com.nmac.payments.repository.NmacPymntAcntsHsRepository;

@Service
@Transactional(rollbackFor=NmacPymntAcntsHsNotFoundException.class)
public class NmacPymntAcntsHsService 
{
	private static Logger logger = LoggerFactory.getLogger(NmacPymntAcntsHsService.class);
	
	@Autowired
	private NmacPymntAcntsHsRepository nmacpymntacntshsRepository;
		
	/*
	 * READ methods
	 */
	public Page<NmacPymntAcntsHs> findAll(int page, int count) {
		
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntAcntsHsService -> findAll NmacPymntAcntsHss");
		
		return nmacpymntacntshsRepository.findAll(new PageRequest(page, count));
	}

	public Iterable<NmacPymntAcntsHs> findAll() {
		
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntAcntsHsService -> findAll NmacPymntAcntsHss");
		
		return nmacpymntacntshsRepository.findAll();
	}
/*
	public NmacPymntAcntsHs findBySfid(String nmacpymntacntshs){
		if (logger.isDebugEnabled())
			logger.debug("Retrieving NmacPymntAcntsHs with sfid:" + nmacpymntacntshs);
		
		return nmacpymntacntshsRepository.findBySfid(nmacpymntacntshs);
		
	}
*/
	public NmacPymntAcntsHs get(int id) {
		if (logger.isDebugEnabled())
			logger.debug("Retrieving NmacPymntAcntsHs with id:" + id);
		
		NmacPymntAcntsHs elementToGet = nmacpymntacntshsRepository.findOne(id);
		
		if (elementToGet == null)
			throw new NmacPymntAcntsHsNotFoundException(id);
		
		return elementToGet;
	}

	public NmacPymntAcntsHs create(NmacPymntAcntsHs nmacpymntacntshs) {

		if (logger.isDebugEnabled())
			logger.debug("NmacPymntAcntsHsService -> create:" + nmacpymntacntshs);
			
		return nmacpymntacntshsRepository.save(nmacpymntacntshs);
	}

	public NmacPymntAcntsHs update(NmacPymntAcntsHs nmacpymntacntshs) {
		
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntAcntsHsService -> create:" + nmacpymntacntshs);

		NmacPymntAcntsHs elementToUpdate = nmacpymntacntshsRepository.findOne(nmacpymntacntshs.getId());
		
		if (elementToUpdate == null)
			throw new NmacPymntAcntsHsNotFoundException(nmacpymntacntshs.getAcntHldrNm());
		
		elementToUpdate.update(nmacpymntacntshs);
		nmacpymntacntshsRepository.save(elementToUpdate);
		
		return elementToUpdate;
	}

	public NmacPymntAcntsHs delete(int id) {
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntAcntsHsService -> delete:" + id);

		NmacPymntAcntsHs elementToDelete = get(id);
		
		if (elementToDelete == null)
			throw new NmacPymntAcntsHsNotFoundException(id);
		
		nmacpymntacntshsRepository.delete(elementToDelete);

		return elementToDelete;
	}

}

