package com.xworkz.song.controller;

import com.xworkz.song.dto.PassportDTO;
import com.xworkz.song.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PassportController {
    @Autowired
    private PassportService passportService;
    public PassportController()
    {
        System.out.println("created PassportController");
    }
    @RequestMapping("/submit-registration")
    public String onSave(PassportDTO dto)
    {
        System.out.println("onSave created");
        System.out.println(dto);
        boolean ref=this.passportService.validate(dto);
        if(ref)
        {
            System.out.println("Success");
        }
        else {
            System.out.println("Failure");
        }
        return "Passport.jsp";
    }
}
