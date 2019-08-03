package com.catalystone.mbs.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="theater")
public class Theater {
    @Column(name="theater_id")
    @Id
    @GeneratedValue
    private Long tid;

    @Column(name="theatre_name")
    private String name;
}
