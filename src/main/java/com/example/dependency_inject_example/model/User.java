package com.example.dependency_inject_example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class User {
    @Id
    private Long id;
    private String name;
    private String userEmail;
}
