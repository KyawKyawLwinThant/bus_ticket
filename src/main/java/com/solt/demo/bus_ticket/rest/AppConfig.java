package com.solt.demo.bus_ticket.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;
import java.util.Set;

@ApplicationPath("rs")
@Configuration
public class AppConfig extends ResourceConfig {
  public AppConfig() {
    register(BusResources.class);
  }
}
