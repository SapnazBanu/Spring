package com.xworkz.song.service;

import com.xworkz.song.dto.PassportDTO;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService{
    public PassportServiceImpl()
    {
        System.out.println("PassportServiceImpl created");
    }

    @Override
    public boolean validate(PassportDTO dto) {
        return true;
    }
}
