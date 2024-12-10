package com.xworkz.song.service;

import com.xworkz.song.dto.DeathCertificateDTO;
import org.springframework.stereotype.Service;

@Service
public class DeathCertificateServiceImpl implements DeathCertificateService {
    public DeathCertificateServiceImpl()
    {
        System.out.println("DeathCertificateServiceImpl created");
    }
    @Override
    public boolean validate(DeathCertificateDTO dto) {
        return true;
    }



}
