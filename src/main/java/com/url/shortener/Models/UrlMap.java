package com.url.shortener.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.time.LocalDateTime;

@Entity
@Data
public class UrlMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String original_url;
    private String shorturl;
    private int clickCount = 0;
    private LocalDateTime createdDate;

    //Relationship between User and Url Map
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "url_map_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClickEvent> clicks;
}
