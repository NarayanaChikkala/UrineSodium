package com.narayana.UrineSodium;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UrineSodiumController {
	@Autowired
	UrineSodiumRepository hypotermiarepository;
	
	protected Logger logger = Logger
			.getLogger(UrineSodiumController.class.getName());
	
	@RequestMapping("/UrineSodium/{urineSodium}")
	public String UrineSodium(@PathVariable("urineSodium") String urineSodium) {
		logger.info("accounts-changed byId() invoked: " + urineSodium);
		String retVal = hypotermiarepository.getUrineSodium(urineSodium);
		logger.info("accounts-microservice byId() found: " + retVal);
		return retVal;
	}

}
