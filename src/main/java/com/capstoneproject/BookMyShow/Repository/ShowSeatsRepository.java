package com.capstoneproject.BookMyShow.Repository;

import com.capstoneproject.BookMyShow.Model.ShowSeatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatsRepository extends JpaRepository<ShowSeatsEntity, Integer> {
}
