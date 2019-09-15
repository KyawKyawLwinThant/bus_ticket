package com.solt.demo.bus_ticket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@IdClass(BusRouteId.class)
public class BusRoute {
  @Id
  @ManyToOne
  @JoinColumn(referencedColumnName = "id")
  private Bus bus;
  @Id
  @ManyToOne
  @JoinColumn(referencedColumnName = "id")
  private Route route;

  private LocalDateTime departureTime;
  private LocalDateTime arrivalTime;

  @ElementCollection
  @CollectionTable(name = "Route_Bus_Top")
  private List<String> busStop=new ArrayList<>();

  public BusRoute(Bus bus, Route route, LocalDateTime departureTime, LocalDateTime arrivalTime, List<String> busStop) {
    this.bus = bus;
    this.route = route;
    this.departureTime = departureTime;
    this.arrivalTime = arrivalTime;
    this.busStop = busStop;
  }
}
