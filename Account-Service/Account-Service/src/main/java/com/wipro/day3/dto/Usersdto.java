package com.wipro.day3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usersdto {
    public int id;
    public String name;
    public String email;
    public String password;
    public String location;
    public String savingnumber;
    public String savingbalance;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSavingnumber() {
        return savingnumber;
    }

    public void setSavingnumber(String savingnumber) {
        this.savingnumber = savingnumber;
    }

    public String getSavingbalance() {
        return savingbalance;
    }

    public void setSavingbalance(String savingbalance) {
        this.savingbalance = savingbalance;
    }
}
