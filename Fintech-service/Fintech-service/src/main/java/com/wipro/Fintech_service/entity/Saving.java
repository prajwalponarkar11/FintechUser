package com.wipro.Fintech_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "fintech")
public class Saving {
    @Id
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
}
