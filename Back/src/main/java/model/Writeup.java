package model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Writeup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String slug; // pour l’URL comme /writeups/nom-du-writeup
    private String category;
    private String content;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
