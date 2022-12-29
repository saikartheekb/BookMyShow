package com.capstoneproject.BookMyShow.Repository;

import com.capstoneproject.BookMyShow.Model.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
}
