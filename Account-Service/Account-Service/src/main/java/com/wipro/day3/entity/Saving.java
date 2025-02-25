package com.wipro.day3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "saving_account")
public class Saving {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mutualFund;
    private String lifeInsurance;
    private String goldSaving;

    @OneToOne(mappedBy = "saving")
    private Account account;

    public Saving() {}

    public Saving(String mutualFund, String lifeInsurance, String goldSaving) {
        this.mutualFund = mutualFund;
        this.lifeInsurance = lifeInsurance;
        this.goldSaving = goldSaving;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMutualFund() { return mutualFund; }
    public void setMutualFund(String mutualFund) { this.mutualFund = mutualFund; }

    public String getLifeInsurance() { return lifeInsurance; }
    public void setLifeInsurance(String lifeInsurance) { this.lifeInsurance = lifeInsurance; }

    public String getGoldSaving() { return goldSaving; }
    public void setGoldSaving(String goldSaving) { this.goldSaving = goldSaving; }

    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }
}
