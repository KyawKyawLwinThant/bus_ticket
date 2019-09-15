package com.solt.demo.bus_ticket.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookingInfo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String bookingNumber;
  private LocalDate bookingDate;
  @OneToOne
  private BusRoute busRoute;

  @OneToOne(cascade = CascadeType.PERSIST)
  private UserInfo userInfo;

  @OneToMany(cascade = CascadeType.PERSIST)
  @JoinColumn(name="bookinginfo_id_fk")
  private List<Payment> payments=new ArrayList<>();

}
