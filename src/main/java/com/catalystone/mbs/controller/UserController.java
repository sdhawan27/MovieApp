package com.catalystone.mbs.controller;

import com.catalystone.mbs.entity.Bookings;
import com.catalystone.mbs.entity.ShowTimings;
import com.catalystone.mbs.entity.Theater;
import com.catalystone.mbs.exception.UserException;
import com.catalystone.mbs.repository.BookingRepository;
import com.catalystone.mbs.repository.ShowTimingsRepository;
import com.catalystone.mbs.repository.TheaterRepository;
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

    @Autowired
    TheaterRepository tRepo;

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

    @GetMapping("/getTheaters")
    public ResponseEntity<List<Theater>> getTheaters (){
        List<Theater> theaters = tRepo.findAll();
        return ResponseEntity.ok(theaters);
    }

}
