package com.wipro.day3.service;

import com.wipro.day3.dto.AccountDto;
import com.wipro.day3.dto.Responsedto;
import com.wipro.day3.dto.SavingDto;
import com.wipro.day3.entity.Account;
import com.wipro.day3.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepo accountRepo;

    public Account createAccount(Account account) {
        return accountRepo.save(account);
    }

    public Responsedto getAccountDetails(Long accNumber) {
        Account account = accountRepo.findByAccNumber(accNumber);
        if (account == null) {
            return null;
        }

        // Convert Account to AccountDto
        AccountDto accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setName(account.getName());
        accountDto.setAccNumber(account.getAccNumber());
        accountDto.setBranch(account.getBranch());
        accountDto.setIfsc(account.getIfsc());
        accountDto.setBalance(account.getBalance());

        // Convert Saving to SavingDto (if available)
        SavingDto savingDto = null;
        if (account.getSaving() != null) {
            savingDto = new SavingDto();
            savingDto.setId(account.getSaving().getId());
            savingDto.setMutualFund(account.getSaving().getMutualFund());
            savingDto.setLifeInsurance(account.getSaving().getLifeInsurance());
            savingDto.setGoldSaving(account.getSaving().getGoldSaving());
        }

        // Create and return the ResponseDto
        return new Responsedto(accountDto, savingDto);
    }
}
