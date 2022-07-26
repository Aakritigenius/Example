package com.AdminServices.Resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/version1/")
public class AdminController {
//    @RequestMapping("/")

    // To connect with the zuul application
    @GetMapping("Admin")
    public String Hello(){
        return "Hello Admin";
    }

}
