package controller;

import model.Writeup;
import service.WriteupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/writeups")
@CrossOrigin // autorise le front Vue à faire des requêtes
public class WriteupController {

    private final WriteupService service;

    public WriteupController(WriteupService service) {
        this.service = service;
    }

    @GetMapping
    public List<Writeup> getAll() {
        return service.getAll();
    }

    @GetMapping("/{slug}")
    public Writeup getBySlug(@PathVariable String slug) {
        return service.getBySlug(slug);
    }

    @PostMapping
    public Writeup create(@RequestBody Writeup writeup) {
        return service.save(writeup);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
