package com.example.example;

import com.example.example.event.Application;
import com.example.example.event.Release;
import com.example.example.repository.ApplicationRepository;
import com.example.example.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

    @Autowired
    private ApplicationRepository repository;
   @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public void run(String... args) throws Exception {
        Application application1=Application.builder().applicationEmailId("arpit.iitdhn@gmail.com").applicationName("ApplicationStore1").applicationOwner("Arpit Bhargava").applicationSealId("101").build();
        Application application2=Application.builder().applicationEmailId("abc.xyz@gmail.com").applicationName("ApplicationStore2").applicationOwner("ABC XYZ").applicationSealId("102").build();
        List<Application> applicationList=new ArrayList<>();
        applicationList.add(application1);
        applicationList.add(application2);
        repository.saveAll(applicationList);

        Release release1= Release.builder().application(application1).version("1.0").build();
        Release release2= Release.builder().application(application2).version("1.0").build();
        List<Release> releaseList=new ArrayList<>();
        releaseList.add(release1);
        releaseList.add(release2);
        releaseRepository.saveAll(releaseList);
    }
}
