package com.catalystone.mbs.controller;

import com.catalystone.mbs.entity.Movie;
import com.catalystone.mbs.entity.ShowTimings;
import com.catalystone.mbs.entity.Theater;
import com.catalystone.mbs.exception.AdminException;
import com.catalystone.mbs.repository.MovieRepository;
import com.catalystone.mbs.repository.ShowTimingsRepository;
import com.catalystone.mbs.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/admin")
public class AdminController {
    @Autowired
    TheaterRepository tRepo;

    @Autowired
    MovieRepository mRepo;

    @Autowired
    ShowTimingsRepository sRepo;

    @PostMapping("/theater")
    public ResponseEntity<Theater> addTheater (@RequestBody Theater theater){
        return ResponseEntity.ok(tRepo.save(theater));
    }

    @PostMapping("/movie")
    public ResponseEntity<Movie> addMovie (@RequestBody Movie movie) {
        return ResponseEntity.ok(mRepo.save(movie));
    }

    @PostMapping("/addShows")
    public ResponseEntity<ShowTimings> addShows (@RequestBody ShowTimings showTimings){
        return ResponseEntity.ok(sRepo.save(showTimings));
    }

    @GetMapping("/dTheater")
    public void deleteTheater (@RequestParam("tid") String tid) throws AdminException{
        Theater theater = tRepo.findByTid(Long.parseLong(tid));
        if(null == theater){
            throw new AdminException("Can not find theater with given id");
        }
        tRepo.delete(theater);
    }
}
