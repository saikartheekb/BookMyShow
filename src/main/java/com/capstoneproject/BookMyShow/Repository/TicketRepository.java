package com.capstoneproject.BookMyShow.Repository;

import com.capstoneproject.BookMyShow.Model.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
}
