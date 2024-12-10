package com.xworkz.song.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BankDTO {
    private long accountNumber;
    private String accountHolderName;
    private String email;
    private long phoneNo;
    private double balance;

}
