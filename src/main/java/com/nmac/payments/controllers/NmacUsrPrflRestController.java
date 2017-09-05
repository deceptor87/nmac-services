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
import com.nmac.payments.entities.NmacUsrPrfl;
import com.nmac.payments.services.NmacUsrPrflService;

@Controller
@RequestMapping(value="/api/v1/nmacusrprfl")
public class NmacUsrPrflRestController {
	
	private static Logger logger = LoggerFactory.getLogger(NmacUsrPrflRestController.class);
	
	@Autowired
	private NmacUsrPrflService nmacusrprflService;
		
	/*
	 * READ METHODS
	 */

	@RequestMapping(value="", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getAll() {

		if (logger.isDebugEnabled())
			logger.debug("NmacUsrPrflService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(nmacusrprflService.findAll());
		} catch (Exception e) {
			logger.error("NmacUsrPrflController -> getAll", e);
			responseMessage.setError(-1, "Unable to get page for NmacUsrPrfl: " + e.getMessage());
		}
		return responseMessage;
	}

	@RequestMapping(value="/page", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getPage(@RequestParam int page, @RequestParam int records) {

		if (logger.isDebugEnabled())
			logger.debug("NmacUsrPrflService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(nmacusrprflService.findAll(page, records));
		} catch (Exception e) {
			logger.error("NmacUsrPrflController -> getPage", e);
			responseMessage.setError(-1, "Unable to get page for NmacUsrPrfl: " + e.getMessage());
		}
		return responseMessage;
		
	}


//	@RequestMapping(value="/count", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getCount() {
//
//		if (logger.isDebugEnabled())
//			logger.debug("NmacUsrPrflService -> getAll");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(nmacusrprflService.count());
//		} catch (Exception e) {
//			logger.error("NmacUsrPrflController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all NmacUsrPrfl: " + e.getMessage());
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
//			logger.debug("NmacUsrPrflService -> getPage(" + page + "," + size + ")");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(nmacusrprflService.getPage(page, size));
//		} catch (Exception e) {
//			logger.error("NmacUsrPrflController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all NmacUsrPrfl: " + e.getMessage());
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
//			logger.debug("NmacUsrPrflService -> getDropDownElements");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(nmacusrprflService.getDropDownValues());
//		} catch (Exception e) {
//			logger.error("NmacUsrPrflController -> getDropDownElements", e);
//			responseMessage.setError(-1, "Unable to getDropDownElements for NmacUsrPrfl: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public ResponseMessage getOne(@PathVariable Integer id) {
		if (logger.isDebugEnabled())
			logger.debug("NmacUsrPrflService -> getOne(" + id + ")");
		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(nmacusrprflService.get(id));
		} catch (Exception e) {
			logger.error("NmacUsrPrflController -> create", e);
			responseMessage.setError(-1,
					"Unable to create NmacUsrPrfl: " + id + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	
	/*
	 * DML Methods
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage create(@RequestBody NmacUsrPrfl element) {

		if (logger.isDebugEnabled())
			logger.debug("NmacUsrPrflService -> create:" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(nmacusrprflService.create(element));
		} catch (Exception e) {
			logger.error("NmacUsrPrflController -> create", e);
			responseMessage.setError(-1,
					"Unable to create NmacUsrPrfl: " + element + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage edit(@PathVariable Integer id, @RequestBody NmacUsrPrfl element) {
		if (logger.isDebugEnabled())
			logger.debug("NmacUsrPrflService -> edit(" + id + "):" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			element.setId(id);
			responseMessage.setData(nmacusrprflService.create(element));
		} catch (Exception e) {
			logger.error("NmacUsrPrflController -> edit", e);
			responseMessage.setError(-1,
					"Unable to edit NmacUsrPrfl: " + element + ",Error:" + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE, 
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage delete(@PathVariable Integer id) {

		if (logger.isDebugEnabled())
			logger.debug("NmacUsrPrflService -> delete(" + id + ")");

		ResponseMessage responseMessage = new ResponseMessage();
		try {
			nmacusrprflService.delete(id);
		} catch (Exception e) {
			logger.error("NmacUsrPrflController -> delete", e);
			responseMessage.setError(-1, "Unable to delete NmacUsrPrfl: " + id + ",Error:"  + e.getMessage());
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

