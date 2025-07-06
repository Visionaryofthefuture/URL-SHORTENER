package com.url.shortener.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Getter
@Setter 
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String role;
    private String username;

}
