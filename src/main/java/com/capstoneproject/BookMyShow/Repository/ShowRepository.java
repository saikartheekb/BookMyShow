package com.capstoneproject.BookMyShow.Repository;

import com.capstoneproject.BookMyShow.Model.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity, Integer> {
}
