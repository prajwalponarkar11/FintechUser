package com.wipro.day3.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Long accNumber;
    private String branch;
    private String ifsc;
    private String balance;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "saving_id", referencedColumnName = "id")
    @JsonIgnore
    private Saving saving;

    public Account() {}

    public Account(String name, Long accNumber, String branch, String ifsc, String balance, Saving saving) {
        this.name = name;
        this.accNumber = accNumber;
        this.branch = branch;
        this.ifsc = ifsc;
        this.balance = balance;
        this.saving = saving;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getAccNumber() { return accNumber; }
    public void setAccNumber(Long accNumber) { this.accNumber = accNumber; }

    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }

    public String getIfsc() { return ifsc; }
    public void setIfsc(String ifsc) { this.ifsc = ifsc; }

    public String getBalance() { return balance; }
    public void setBalance(String balance) { this.balance = balance; }

    public Saving getSaving() { return saving; }
    public void setSaving(Saving saving) { this.saving = saving; }
}
