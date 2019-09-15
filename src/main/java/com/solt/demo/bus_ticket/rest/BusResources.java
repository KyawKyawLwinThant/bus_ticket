package com.solt.demo.bus_ticket.rest;

import com.solt.demo.bus_ticket.model.Bus;
import com.solt.demo.bus_ticket.model.Seats;
import com.solt.demo.bus_ticket.repository.BusRepository;
import com.solt.demo.bus_ticket.repository.SeatsRepository;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("bus")
public class BusResources {

  private final BusRepository busRepository;
  private final SeatsRepository seatsRepository;

  public BusResources(BusRepository busRepository,SeatsRepository seatsRepository) {
    this.busRepository = busRepository;
    this.seatsRepository=seatsRepository;
  }

  @GET
  @Path("all")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Bus> showAllBus(){
    return  this.busRepository.findAll();
  }


  @GET
  @Path("/seats/all")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Seats> showAllSeats(){
    return this.seatsRepository.findAll();
  }

}
