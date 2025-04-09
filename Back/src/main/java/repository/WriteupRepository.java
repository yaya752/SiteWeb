package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Writeup;

public interface WriteupRepository extends JpaRepository<Writeup, Long> {
    Writeup findBySlug(String slug);
}