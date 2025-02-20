package com.wipro.Fintech_service.service;

import com.wipro.Fintech_service.entity.Saving;
import com.wipro.Fintech_service.repository.Savingrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavingService {
    @Autowired
    private Savingrepo repo;

    public Saving create(Saving saving) {
        return repo.save(saving);
    }

    public List<Saving> getSaving(String savingnumber) {
        return repo.findBySavingnumber(savingnumber);
    }
}
