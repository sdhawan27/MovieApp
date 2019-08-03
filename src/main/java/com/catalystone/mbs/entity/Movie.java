package com.catalystone.mbs.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="movie")
public class Movie {
    @Column(name="movie_id")
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="movie_name")
    private String name;
}
