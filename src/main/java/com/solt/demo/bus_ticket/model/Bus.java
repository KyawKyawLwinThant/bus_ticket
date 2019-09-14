package com.solt.demo.bus_ticket.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bus {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  @Enumerated(EnumType.STRING)
  private BusStatus busStatus;
  private int numberOfSeats;
  @OneToMany
  @JoinColumn(name="bus_id_fk")
  private Set<Seats> seats=new HashSet<>();

  public void addSeat(Seats seats){
    this.seats.add(seats);
  }

}
