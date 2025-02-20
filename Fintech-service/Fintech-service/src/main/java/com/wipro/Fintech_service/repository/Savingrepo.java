package com.wipro.Fintech_service.repository;

import com.wipro.Fintech_service.entity.Saving;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Savingrepo extends JpaRepository<Saving,Integer> {

    List<Saving> findBySavingnumber(String savingnumber);
}
