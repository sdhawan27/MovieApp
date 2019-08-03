package com.catalystone.mbs.controller;

import com.catalystone.mbs.entity.Bookings;
import com.catalystone.mbs.entity.ShowTimings;
import com.catalystone.mbs.exception.UserException;
import com.catalystone.mbs.repository.BookingRepository;
import com.catalystone.mbs.repository.ShowTimingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/user")
public class UserController {

    @Autowired
    BookingRepository bookingRepo;

    @Autowired
    ShowTimingsRepository sRepo;

    @GetMapping("/history")
    public ResponseEntity<List<Bookings>> getBookingHistory (@RequestParam("un") String userName)
        throws UserException{
        List<Bookings> bookings = bookingRepo.findByUserName(userName);
        if(bookings == null || bookings.isEmpty())
            throw new UserException("Couldnot find booking");
        return ResponseEntity.ok(bookings);
    }

    @GetMapping("/vshows")
    public ResponseEntity<List<ShowTimings>> getShows (@RequestParam("tid") Long theaterId){
        List<ShowTimings> shows = sRepo.findByTheaterid(theaterId);
        return ResponseEntity.ok(shows);
    }

    @PostMapping("bookTicket")
    public ResponseEntity<Bookings> bookTicket (@RequestBody Bookings booking){
        return ResponseEntity.ok(bookingRepo.save(booking));
    }

}
