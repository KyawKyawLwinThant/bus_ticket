package com.solt.demo.bus_ticket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity

@AllArgsConstructor
@Getter
@Setter
public class Seats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;


    public Seats(){

    }

    public Seats(String seatNumber, SeatStatus seatStatus) {
        this.seatNumber = seatNumber;
        this.seatStatus = seatStatus;
    }
}
