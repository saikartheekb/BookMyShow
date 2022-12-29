package com.capstoneproject.BookMyShow.Repository;

import com.capstoneproject.BookMyShow.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}