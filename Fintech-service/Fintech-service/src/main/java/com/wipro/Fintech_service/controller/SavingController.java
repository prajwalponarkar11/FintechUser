package com.wipro.Fintech_service.controller;

import com.wipro.Fintech_service.entity.Saving;
import com.wipro.Fintech_service.service.SavingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saving")
public class SavingController {
    @Autowired
    private SavingService service;

    @PostMapping
    public Saving create(@RequestBody Saving saving ){
        return service.create(saving);
    }

    @GetMapping("{savingnumber}")
    public List<Saving> getSaving(@PathVariable String savingnumber){
        return service.getSaving(savingnumber);
    }
}
