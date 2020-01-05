package com.example.example.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.example.event.Application;
import com.example.example.event.Release;
import com.example.example.repository.ApplicationRepository;
import com.example.example.repository.ReleaseRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {
    @Autowired
    private ApplicationRepository applicationRepository;
    @Autowired
    private ReleaseRepository releaseRepository;


    public Iterable<Application> findAllApplications() {
        return applicationRepository.findAll();
    }

    public long countApplications() {
        return applicationRepository.count();
    }

    public Iterable<Release> findAllRelease() {
        return releaseRepository.findAll();
    }


}
