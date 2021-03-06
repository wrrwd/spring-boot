package cn.timebusker.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.timebusker.util.LoggingUtil;


@RestController
public class LogsController {
	
	private final static Logger logger = LoggerFactory.getLogger(LogsController.class);
	
	@RequestMapping(value = { "/**", "/" }, method = RequestMethod.GET)
	public String createLogs() {
		logger.info("----------------------------------INFO");
		logger.debug("----------------------------------DEBUG");
		logger.error("----------------------------------ERROR");
		LoggingUtil.creatLogging();
		return "Hello,this is spring-boot-starter-actuator";
	}
}
