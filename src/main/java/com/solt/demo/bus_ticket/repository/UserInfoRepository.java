package com.solt.demo.bus_ticket.repository;

import com.solt.demo.bus_ticket.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {
}
