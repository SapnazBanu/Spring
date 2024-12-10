package com.xworkz.song.service;

import com.xworkz.song.dto.HospitalDTO;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService {
    public HospitalServiceImpl()
    {
        System.out.println("Created HospitalServiceImpl");
    }

    @Override
    public boolean validate(HospitalDTO dto) {
        return true;
    }


}
