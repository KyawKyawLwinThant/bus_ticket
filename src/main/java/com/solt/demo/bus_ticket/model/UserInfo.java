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
public class UserInfo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String firstName;
  private String lastName;
  private String password;
  private String email;
  @Enumerated(EnumType.STRING)
  private Gender gender;
  private String nrcNumber;
  private String phoneNumber;
  private String address;

  @ManyToMany
  private Set<Role> roles=
          new HashSet<>();

}
