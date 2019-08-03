package com.catalystone.mbs.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="show_timings")
public class ShowTimings {

    @Column(name="show_id")
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="movie_id")
    private String movieId;

    @Column(name="theater_id")
    private String theaterid;

    @Column(name="tickets_available")
    private Integer noOfTickets;

    @Column(name="show_time")
    private Date showTime;
}
