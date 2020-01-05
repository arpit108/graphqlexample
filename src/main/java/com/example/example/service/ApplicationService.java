package com.example.example.service;

import com.example.example.event.Application;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ApplicationService {

    public List<Application> getAllApplication();

    public void addApplication(Application application);
}
