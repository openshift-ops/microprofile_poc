package com.example.microprofile.demo.wildfly.microprofile;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 */
@Path("/hello")
@ApplicationScoped
public class HelloController {

    @GET
    public String sayHello() {
        return "Hello World";
    }
}
