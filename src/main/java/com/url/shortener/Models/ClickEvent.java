package com.url.shortener.Models;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Clicks")
public class ClickEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDateTime click_Date;
    private Long url_map_id;

    @ManyToOne
    @JoinColumn(name = "url_mapping_id") // a foreign key in database that links ClickEvent and UrlMap
    private UrlMap urlMap;
}
