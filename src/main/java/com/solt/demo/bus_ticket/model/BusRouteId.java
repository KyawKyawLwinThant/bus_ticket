package com.solt.demo.bus_ticket.model;

import lombok.Data;

import java.io.Serializable;
@Data
public class BusRouteId implements Serializable {
  private Integer bus;
  private Integer route;
}
