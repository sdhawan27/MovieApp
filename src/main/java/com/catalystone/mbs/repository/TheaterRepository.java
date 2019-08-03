package com.catalystone.mbs.repository;

import com.catalystone.mbs.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepository extends JpaRepository<Theater,Long> {

    Theater findByTid(Long theaterId);
}
