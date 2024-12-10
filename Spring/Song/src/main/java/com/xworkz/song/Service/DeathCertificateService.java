package com.xworkz.song.service;

import com.xworkz.song.dto.DeathCertificateDTO;
import org.springframework.stereotype.Service;

@Service
public interface DeathCertificateService {
    boolean validate(DeathCertificateDTO dto);
    }

