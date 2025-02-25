package com.wipro.day3.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class AccountDto {
    private int id;
    private String name;
    private Long accNumber;
    private String branch;
    private String ifsc;
    private String balance;

    public AccountDto(){}

    public AccountDto(int id, String name, Long accNumber, String branch, String ifsc, String balance) {
        this.id = id;
        this.name = name;
        this.accNumber = accNumber;
        this.branch = branch;
        this.ifsc = ifsc;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(Long accNumber) {
        this.accNumber = accNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
