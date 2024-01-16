package com.projeto.academia.controllers;

import com.projeto.academia.entities.Turma;
import com.projeto.academia.repositories.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="turmas")
public class TurmaController {
    @Autowired
    private TurmaRepository repository;

    @GetMapping
    public List<Turma> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Turma findOne(@PathVariable Long id) {

        return repository.findById(id).get();
    }

    @PostMapping
    public Turma insert(@RequestBody Turma turma) {
        return repository.save(turma);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        repository.deleteById(id);
    }

    @PutMapping("/")
    public void update(@RequestBody Turma turma) {

        repository.save(turma);
    }
}
