package com.wipro.User_service.service;

import com.wipro.User_service.dto.Responsedto;
import com.wipro.User_service.dto.Savingdto;
import com.wipro.User_service.dto.Usersdto;
import com.wipro.User_service.entity.Users;
import com.wipro.User_service.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private WebClient webClient;
    public Users adduser(Users user) {
        return userRepo.save(user);
    }

    public Responsedto getusers(String savingnumber) {
        Responsedto dto=new Responsedto();
        Users user=userRepo.findBySavingnumber(savingnumber).orElseThrow(()->new RuntimeException("user are not found"));
        Usersdto usersdto=mapToUserdto(user);
        List<Savingdto> savingdtoList=webClient.get()
                .uri("http://localhost:9098/saving/"+savingnumber)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Savingdto>>() {})
                .block();

        dto.setDto1(usersdto);
        dto.setDto2(savingdtoList);
        return dto;
    }

    private Usersdto mapToUserdto(Users user) {
        Usersdto dto=new Usersdto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setSavingnumber(user.getSavingnumber());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        dto.setLocation(user.getLocation());
        dto.setSavingbalance(dto.getSavingnumber());
        return dto;
    }
}
