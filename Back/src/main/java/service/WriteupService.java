package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Writeup;
import repository.WriteupRepository;

@Service
public class WriteupService {

    private final WriteupRepository repository;

    public WriteupService(WriteupRepository repository) {
        this.repository = repository;
    }

    public List<Writeup> getAll() {
        return repository.findAll();
    }

    public Writeup getBySlug(String slug) {
        return repository.findBySlug(slug);
    }

    public Writeup save(Writeup writeup) {
        return repository.save(writeup);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
