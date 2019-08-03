package com.catalystone.mbs.repository;

import com.catalystone.mbs.entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookingRepo")
public interface BookingRepository extends JpaRepository<Bookings,Long> {

    List<Bookings> findByUserName(String userName);
}
