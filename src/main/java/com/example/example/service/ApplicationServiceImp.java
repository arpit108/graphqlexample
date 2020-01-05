package com.example.example.service;

import com.example.example.event.Application;
import com.example.example.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ApplicationServiceImp {
    private ApplicationRepository applicationRepository;

    public List<Application> getAllApplication() {
        return (List<Application>) applicationRepository.findAll();
    }

    public void addApplication(Application application) {
        applicationRepository.save(application);
    }


}
