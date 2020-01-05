package com.example.example.controller;

import com.example.example.event.Application;
import com.example.example.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/application")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    @GetMapping
    public Iterable<Application> getApplicationData() {
        return applicationService.getAllApplication();

    }

    @PostMapping
    public void postApplication(@RequestBody Application application) {
        applicationService.addApplication(application);
    }


}
