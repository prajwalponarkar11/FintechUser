package com.wipro.day3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class Responsedto {
    public AccountDto accountDto;
    public SavingDto savingDto;

    public Responsedto() {
    }

    public Responsedto(AccountDto accountDto, SavingDto savingDto) {
        this.accountDto = accountDto;
        this.savingDto = savingDto;
    }

    public AccountDto getAccountDto() {
        return accountDto;
    }

    public void setAccountDto(AccountDto accountDto) {
        this.accountDto = accountDto;
    }

    public SavingDto getSavingDto() {
        return savingDto;
    }

    public void setSavingDto(SavingDto savingDto) {
        this.savingDto = savingDto;
    }
}
