package com.example.example.event;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Release")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Release {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String version;
    @ManyToOne
   private Application application;


}
