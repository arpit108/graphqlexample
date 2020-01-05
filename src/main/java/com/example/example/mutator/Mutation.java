package com.example.example.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.example.event.Application;
import com.example.example.exception.ApplicationNotFoundException;
import com.example.example.repository.ApplicationRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver {
    private ApplicationRepository applicationRepository;

    public Application newApplication(String applicationName, String applicationSealId,
                                      String applicationOwner, String applicationEmailId) {
        Application app = Application.builder().applicationEmailId(applicationEmailId).applicationName(applicationName).applicationOwner(applicationOwner).applicationSealId(applicationSealId).build();
        applicationRepository.save(app);
        return app;
    }

    public boolean deleteApplication(Long id) {
        applicationRepository.deleteById(id);
        return true;
    }

    public Application updateApplicationOwner(String applicationSealId, Long id) {
        Optional<Application> optionalApplication =
                applicationRepository.findById(id);

        if (optionalApplication.isPresent()) {
            Application application = optionalApplication.get();
            application.setApplicationSealId(applicationSealId);
            applicationRepository.save(application);
            return application;
        } else {
            throw new ApplicationNotFoundException("Application Not Found", id);
        }
    }
}
