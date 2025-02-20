package com.wipro.User_service.controller;

import com.wipro.User_service.dto.Responsedto;
import com.wipro.User_service.entity.Users;
import com.wipro.User_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Users adduser(@RequestBody Users user){

        return userService.adduser(user);
    }

    @GetMapping("withsaving/{savingnumber}")
    public ResponseEntity<Responsedto> getuser(@PathVariable("savingnumber") String savingnumber){
        Responsedto responsedto = userService.getusers(savingnumber);
        return ResponseEntity.ok(responsedto);
    }

}
