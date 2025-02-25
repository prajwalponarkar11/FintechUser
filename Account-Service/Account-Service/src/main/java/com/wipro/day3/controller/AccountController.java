package com.wipro.day3.controller;

import com.wipro.day3.dto.Responsedto;
import com.wipro.day3.entity.Account;
import com.wipro.day3.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping()
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        Account accountAdded = accountService.createAccount(account);
        return new ResponseEntity<>(accountAdded, HttpStatus.CREATED);
    }

    @GetMapping("/{accNo}")
    public ResponseEntity<Responsedto> getAccountDetails(@PathVariable("accNo") Long accNumber) {
        Responsedto responseDto = accountService.getAccountDetails(accNumber);
        if (responseDto == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
}
