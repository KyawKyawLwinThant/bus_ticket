package com.solt.demo.bus_ticket.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bus {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  @Enumerated(EnumType.STRING)
  private BusStatus busStatus;
  private int numberOfSeats;
  @OneToMany(fetch = FetchType.EAGER)
  @JoinColumn(name="bus_id_fk")
  //@JsonIgnore
  private Set<Seats> seats=new HashSet<>();

  public void addSeat(Seats seats){
    this.seats.add(seats);
  }

  public Bus(){

  }

  public Bus(String name, BusStatus busStatus, int numberOfSeats) {
    this.name = name;
    this.busStatus = busStatus;
    this.numberOfSeats = numberOfSeats;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BusStatus getBusStatus() {
    return busStatus;
  }

  public void setBusStatus(BusStatus busStatus) {
    this.busStatus = busStatus;
  }

  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  public Set<Seats> getSeats() {
    return seats;
  }

  public void setSeats(Set<Seats> seats) {
    this.seats = seats;
  }
}
