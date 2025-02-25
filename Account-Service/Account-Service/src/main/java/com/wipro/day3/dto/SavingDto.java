package com.wipro.day3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class SavingDto {
    private int id;
    private String mutualFund;
    private String lifeInsurance;
    private String goldSaving;

    public SavingDto() {
    }

    public SavingDto(int id, String mutualFund, String lifeInsurance, String goldSaving) {
        this.id = id;
        this.mutualFund = mutualFund;
        this.lifeInsurance = lifeInsurance;
        this.goldSaving = goldSaving;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMutualFund() {
        return mutualFund;
    }

    public void setMutualFund(String mutualFund) {
        this.mutualFund = mutualFund;
    }

    public String getLifeInsurance() {
        return lifeInsurance;
    }

    public void setLifeInsurance(String lifeInsurance) {
        this.lifeInsurance = lifeInsurance;
    }

    public String getGoldSaving() {
        return goldSaving;
    }

    public void setGoldSaving(String goldSaving) {
        this.goldSaving = goldSaving;
    }
}
