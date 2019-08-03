package com.catalystone.mbs.repository;

import com.catalystone.mbs.entity.ShowTimings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowTimingsRepository extends JpaRepository<ShowTimings,Long> {
    List<ShowTimings>  findByTheaterid(Long theaterId);
}
