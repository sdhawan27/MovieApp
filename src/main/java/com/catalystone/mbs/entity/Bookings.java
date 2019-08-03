package com.catalystone.mbs.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="bookings")
public class Bookings {

    @Column(name="booking_no")
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="username")
    private String userName;

    @Column(name="no_of_tickets")
    private Integer noOfTickets;

    @Column(name="show_id")
    private String show;


}
