package com.xworkz.song.controller;

import com.xworkz.song.dto.HospitalDTO;
import com.xworkz.song.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;
    public HospitalController()
    {
        System.out.println("Created HospitalController");
    }
    @RequestMapping("/bookAppointment")
    public String onSave(HospitalDTO dto)
    {
        System.out.println("created onSave");
        System.out.println(dto);
        boolean ref=this.hospitalService.validate(dto);
        if(ref)
        {
            System.out.println("Success");
        }
        else {
            System.out.println("Failure");
        }
        return "Hospital.jsp";
    }
}
