package com.wipro.User_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Responsedto {
    public Usersdto dto1;
    public List<Savingdto> dto2;

    public Usersdto getDto1() {
        return dto1;
    }

    public void setDto1(Usersdto dto1) {
        this.dto1 = dto1;
    }

    public List<Savingdto> getDto2() {
        return dto2;
    }

    public void setDto2(List<Savingdto> dto2) {
        this.dto2 = dto2;
    }
}
