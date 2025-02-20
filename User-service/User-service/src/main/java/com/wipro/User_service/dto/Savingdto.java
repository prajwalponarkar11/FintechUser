package com.wipro.User_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Savingdto {
    public int id;
    public String savingnumber;
    public String name;
    public String typeofsaving;
    public String company;
    public String description;
    public String amount;
    public String duration;
    public String interest;
    public String rateofinterest;
    public String maturityamount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSavingnumber() {
        return savingnumber;
    }

    public void setSavingnumber(String savingnumber) {
        this.savingnumber = savingnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeofsaving() {
        return typeofsaving;
    }

    public void setTypeofsaving(String typeofsaving) {
        this.typeofsaving = typeofsaving;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getRateofinterest() {
        return rateofinterest;
    }

    public void setRateofinterest(String rateofinterest) {
        this.rateofinterest = rateofinterest;
    }

    public String getMaturityamount() {
        return maturityamount;
    }

    public void setMaturityamount(String maturityamount) {
        this.maturityamount = maturityamount;
    }
}
