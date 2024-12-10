package com.xworkz.song.service;

import com.xworkz.song.dto.BankDTO;
import org.springframework.stereotype.Service;

@Service
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
