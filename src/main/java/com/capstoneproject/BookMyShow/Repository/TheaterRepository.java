package com.capstoneproject.BookMyShow.Repository;

import com.capstoneproject.BookMyShow.Model.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity, Integer> {
}
