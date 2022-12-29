package com.capstoneproject.BookMyShow.Repository;

import com.capstoneproject.BookMyShow.Model.TheaterSeatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterSeatsRepository extends JpaRepository<TheaterSeatsEntity,Integer> {
}
