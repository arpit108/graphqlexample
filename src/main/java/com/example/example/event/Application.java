package com.example.example.event;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Application_Store")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "APPLICATION_NAME")
   private String applicationName;
    @Column(name = "APPLICATION_SEAL_ID")
    private String applicationSealId;
    @Column(name = "APPLICATION_OWNER")
    private String applicationOwner;
    @Column(name = "APPLICATION_EMAIL_ID")
    private String applicationEmailId;
}
