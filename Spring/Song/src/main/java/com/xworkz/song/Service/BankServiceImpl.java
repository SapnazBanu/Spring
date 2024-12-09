package com.xworkz.song.Service;

import com.xworkz.song.DTO.BankDTO;

public class BankServiceImpl implements BankService{
    public BankServiceImpl()
    {
        System.out.println("BankServiceImpl created");
    }
    @Override
    public boolean Validate(BankDTO dto) {
        return true;
    }
}
