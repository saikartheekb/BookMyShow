package com.capstoneproject.BookMyShow.Repository;

import com.capstoneproject.BookMyShow.Model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {

    boolean existsByName(String name);
}
