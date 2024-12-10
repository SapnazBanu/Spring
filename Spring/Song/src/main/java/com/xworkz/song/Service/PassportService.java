package com.xworkz.song.service;

import com.xworkz.song.dto.PassportDTO;
import org.springframework.stereotype.Service;

@Service
public interface PassportService {
    boolean validate(PassportDTO dto);
}
