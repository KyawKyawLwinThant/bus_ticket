package com.solt.demo.bus_ticket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
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
  private String busStop;
}
