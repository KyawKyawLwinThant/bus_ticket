package com.solt.demo.bus_ticket.repository;

import com.solt.demo.bus_ticket.model.Seats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatsRepository extends JpaRepository<Seats,Integer> {
}
