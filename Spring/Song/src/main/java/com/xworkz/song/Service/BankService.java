package com.xworkz.song.service;

import com.xworkz.song.dto.BankDTO;
import org.springframework.stereotype.Service;

@Service
public interface BankService {
    boolean Validate(BankDTO dto);
}
