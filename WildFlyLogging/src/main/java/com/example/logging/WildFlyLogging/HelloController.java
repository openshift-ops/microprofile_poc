package com.example.logging.WildFlyLogging;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 *
 */
@Path("/hello")
@Singleton
public class HelloController {
	
	public static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GET
    public String sayHello() {
    	logger.info("sayHello Method is called");
    	//logger1.info(Log4JMarkerConverter.convertMarker(SecurityMarkers.CONFIDENTIAL), "ssn={}", 1234);
    	//logger1.info(Log4JMarkerConverter.convertMarker(SecurityMarkers.CONFIDENTIAL), "ssn={}", 1234);
        return "Hello World";
    }
}



