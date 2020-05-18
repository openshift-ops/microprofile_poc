package com.example.microprofile.demo.wildfly.microprofile;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 */
@ApplicationScoped
@Path("/hello")
public class HelloController {

    @GET
    @Produces("text/plain")
    public String sayHello() {
        return "Hello World";
    }
}
