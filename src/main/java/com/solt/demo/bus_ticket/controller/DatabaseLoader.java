package com.solt.demo.bus_ticket.controller;

import com.solt.demo.bus_ticket.model.*;
import com.solt.demo.bus_ticket.repository.BusRepository;
import com.solt.demo.bus_ticket.repository.BusRouteRepository;
import com.solt.demo.bus_ticket.repository.RouteRepository;
import com.solt.demo.bus_ticket.repository.SeatsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;

@Component
public class DatabaseLoader implements CommandLineRunner {

  private final BusRepository busRepository;
  private final SeatsRepository seatsRepository;
  private final RouteRepository routeRepository;
  private final BusRouteRepository busRouteRepository;


  public DatabaseLoader(BusRepository busRepository, SeatsRepository seatsRepository, RouteRepository routeRepository, BusRouteRepository busRouteRepository) {
    this.busRepository = busRepository;
    this.seatsRepository = seatsRepository;
    this.routeRepository = routeRepository;
    this.busRouteRepository = busRouteRepository;
  }

  @Override
  @Transactional
  public void run(String... args) throws Exception {

   /* Bus bus1=new Bus("KKT", BusStatus.Ordinary,10);
    Bus bus2=new Bus("LM", BusStatus.Ordinary,10);
    Bus bus3=new Bus("NM", BusStatus.Ordinary,10);
    Bus bus4=new Bus("KAT", BusStatus.Ordinary,10);
    Bus bus5=new Bus("LLM", BusStatus.Ordinary,10);
    Bus bus6=new Bus("MMK", BusStatus.Ordinary,10);


    Seats seats1=new Seats("A1", SeatStatus.Vacant);
    Seats seats2=new Seats("A2", SeatStatus.Vacant);
    Seats seats3=new Seats("B1", SeatStatus.Vacant);
    Seats seats4=new Seats("B2", SeatStatus.Vacant);
    Seats seats5=new Seats("C1", SeatStatus.Vacant);
    Seats seats6=new Seats("C2", SeatStatus.Vacant);
    Seats seats7=new Seats("D1", SeatStatus.Vacant);
    Seats seats8=new Seats("D2", SeatStatus.Vacant);
    Seats seats9=new Seats("E1", SeatStatus.Vacant);
    Seats seats10=new Seats("E2", SeatStatus.Vacant);

    Route route1=new Route("Yangon","Mandalay");
    Route route2=new Route("Yangon","NayPyiTaw");
    Route route3=new Route("Yangon","Bagan");
    Route route4=new Route("Mandalay","Yangon");
    Route route5=new Route("NayPyiTaw","Yangon");
    Route route6=new Route("Bagan","Yangon");


    bus1.getSeats().addAll(Arrays
            .asList(seats1,seats2,seats3,seats4,seats5,seats6,seats7,seats8,
                    seats9,seats10));

    bus2.getSeats().addAll(Arrays
            .asList(seats1,seats2,seats3,seats4,seats5,seats6,seats7,seats8,
                    seats9,seats10));

    bus3.getSeats().addAll(Arrays
            .asList(seats1,seats2,seats3,seats4,seats5,seats6,seats7,seats8,
                    seats9,seats10));

    bus4.getSeats().addAll(Arrays
            .asList(seats1,seats2,seats3,seats4,seats5,seats6,seats7,seats8,
                    seats9,seats10));

    bus5.getSeats().addAll(Arrays
            .asList(seats1,seats2,seats3,seats4,seats5,seats6,seats7,seats8,
                    seats9,seats10));

    bus6.getSeats().addAll(Arrays
            .asList(seats1,seats2,seats3,seats4,seats5,seats6,seats7,seats8,
                    seats9,seats10));


    BusRoute busRoute1=new BusRoute(bus1,route1,
            LocalDateTime.now(),LocalDateTime.now(),Arrays.asList("Pegu","PyinMaNa","Meikhtila"));

            BusRoute busRoute2=new BusRoute(bus2,route2,
            LocalDateTime.now(),LocalDateTime.now(),Arrays.asList("Pegu","PyinMaNa"));

            BusRoute busRoute3=new BusRoute(bus3,route3,
            LocalDateTime.now(),LocalDateTime.now(),Arrays.asList("Pegu","N"));

            BusRoute busRoute4=new BusRoute(bus4,route4,
            LocalDateTime.now(),LocalDateTime.now(),Arrays.asList("Pegu","PyinMaNa","Meikhtila"));

            BusRoute busRoute5=new BusRoute(bus5,route5,
            LocalDateTime.now(),LocalDateTime.now(),Arrays.asList("Pegu","PyinMaNa","Meikhtila"));

            BusRoute busRoute6=new BusRoute(bus6,route6,
            LocalDateTime.now(),LocalDateTime.now(),Arrays.asList("Pegu","PyinMaNa","Meikhtila"));

  */

  /*

    seatsRepository.save(seats1);
    seatsRepository.save(seats2);
    seatsRepository.save(seats3);
    seatsRepository.save(seats4);
    seatsRepository.save(seats5);
    seatsRepository.save(seats6);
    seatsRepository.save(seats7);
    seatsRepository.save(seats8);
    seatsRepository.save(seats9);
    seatsRepository.save(seats10);


    busRepository.save(bus1);
    busRepository.save(bus2);
    busRepository.save(bus3);
    busRepository.save(bus4);
    busRepository.save(bus5);
    busRepository.save(bus6);

    routeRepository.save(route1);
    routeRepository.save(route2);
    routeRepository.save(route3);
    routeRepository.save(route4);
    routeRepository.save(route5);
    routeRepository.save(route6);


    busRouteRepository.save(busRoute1);
    busRouteRepository.save(busRoute2);
    busRouteRepository.save(busRoute3);
    busRouteRepository.save(busRoute4);
    busRouteRepository.save(busRoute5);
    busRouteRepository.save(busRoute6);

  */

  }
}
