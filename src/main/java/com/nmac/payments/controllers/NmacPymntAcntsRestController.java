/*
 * Created on 5 Sep 2017 ( Time 14:30:03 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package com.nmac.payments.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nmac.payments.model.ResponseMessage;
import com.nmac.payments.entities.NmacPymntAcnts;
import com.nmac.payments.services.NmacPymntAcntsService;

@Controller
@RequestMapping(value="/api/v1/nmacpymntacnts")
public class NmacPymntAcntsRestController {
	
	private static Logger logger = LoggerFactory.getLogger(NmacPymntAcntsRestController.class);
	
	@Autowired
	private NmacPymntAcntsService nmacpymntacntsService;
		
	/*
	 * READ METHODS
	 */

	@RequestMapping(value="", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getAll() {

		if (logger.isDebugEnabled())
			logger.debug("NmacPymntAcntsService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(nmacpymntacntsService.findAll());
		} catch (Exception e) {
			logger.error("NmacPymntAcntsController -> getAll", e);
			responseMessage.setError(-1, "Unable to get page for NmacPymntAcnts: " + e.getMessage());
		}
		return responseMessage;
	}

	@RequestMapping(value="/page", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getPage(@RequestParam int page, @RequestParam int records) {

		if (logger.isDebugEnabled())
			logger.debug("NmacPymntAcntsService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(nmacpymntacntsService.findAll(page, records));
		} catch (Exception e) {
			logger.error("NmacPymntAcntsController -> getPage", e);
			responseMessage.setError(-1, "Unable to get page for NmacPymntAcnts: " + e.getMessage());
		}
		return responseMessage;
		
	}


//	@RequestMapping(value="/count", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getCount() {
//
//		if (logger.isDebugEnabled())
//			logger.debug("NmacPymntAcntsService -> getAll");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(nmacpymntacntsService.count());
//		} catch (Exception e) {
//			logger.error("NmacPymntAcntsController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all NmacPymntAcnts: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}

//	@RequestMapping(value="/page", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getPage(@RequestParam int page,@RequestParam int size) {
//
//		if (logger.isDebugEnabled())
//			logger.debug("NmacPymntAcntsService -> getPage(" + page + "," + size + ")");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(nmacpymntacntsService.getPage(page, size));
//		} catch (Exception e) {
//			logger.error("NmacPymntAcntsController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all NmacPymntAcnts: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}
	
//	@RequestMapping(value="/elements", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getDropDownElements() {
//
//		if (logger.isDebugEnabled())
//			logger.debug("NmacPymntAcntsService -> getDropDownElements");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(nmacpymntacntsService.getDropDownValues());
//		} catch (Exception e) {
//			logger.error("NmacPymntAcntsController -> getDropDownElements", e);
//			responseMessage.setError(-1, "Unable to getDropDownElements for NmacPymntAcnts: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public ResponseMessage getOne(@PathVariable Integer id) {
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntAcntsService -> getOne(" + id + ")");
		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(nmacpymntacntsService.get(id));
		} catch (Exception e) {
			logger.error("NmacPymntAcntsController -> create", e);
			responseMessage.setError(-1,
					"Unable to create NmacPymntAcnts: " + id + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	
	/*
	 * DML Methods
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage create(@RequestBody NmacPymntAcnts element) {

		if (logger.isDebugEnabled())
			logger.debug("NmacPymntAcntsService -> create:" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(nmacpymntacntsService.create(element));
		} catch (Exception e) {
			logger.error("NmacPymntAcntsController -> create", e);
			responseMessage.setError(-1,
					"Unable to create NmacPymntAcnts: " + element + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage edit(@PathVariable Integer id, @RequestBody NmacPymntAcnts element) {
		if (logger.isDebugEnabled())
			logger.debug("NmacPymntAcntsService -> edit(" + id + "):" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			element.setId(id);
			responseMessage.setData(nmacpymntacntsService.create(element));
		} catch (Exception e) {
			logger.error("NmacPymntAcntsController -> edit", e);
			responseMessage.setError(-1,
					"Unable to edit NmacPymntAcnts: " + element + ",Error:" + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE, 
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage delete(@PathVariable Integer id) {

		if (logger.isDebugEnabled())
			logger.debug("NmacPymntAcntsService -> delete(" + id + ")");

		ResponseMessage responseMessage = new ResponseMessage();
		try {
			nmacpymntacntsService.delete(id);
		} catch (Exception e) {
			logger.error("NmacPymntAcntsController -> delete", e);
			responseMessage.setError(-1, "Unable to delete NmacPymntAcnts: " + id + ",Error:"  + e.getMessage());
		}
		return responseMessage;
	}
	
	@ExceptionHandler(Exception.class)
	public @ResponseBody
	String handleException(Exception e, HttpServletResponse response) {
	    response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	    return e.getMessage();
	}

}

