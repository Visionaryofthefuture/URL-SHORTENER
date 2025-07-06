package com.url.shortener.Models;

import jakarta.persistence.Entity;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class UrlMap {
    private Long id;
    private String original_url;
    private String shorturl;
    private int clickCount = 0;
    private LocalDateTime createdDate;

    //Relationship between User and Url Map
}
