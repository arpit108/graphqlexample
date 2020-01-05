package com.example.example.service;

import com.example.example.event.Application;
import com.example.example.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    ApplicationRepository applicationRepository;

    public List<Application> getAllApplication() {
        return (List<Application>) applicationRepository.findAll();
    }

    public void addApplication(Application application) {
        applicationRepository.save(application);
    }


}
