package com.xworkz.song.Service;

import com.xworkz.song.DTO.PassportDTO;

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
