package com.xworkz.song.service;

import com.xworkz.song.dto.HospitalDTO;
import org.springframework.stereotype.Service;

@Service
public interface HospitalService {
    boolean validate(HospitalDTO dto);
}
