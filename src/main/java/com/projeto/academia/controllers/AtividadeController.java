package com.projeto.academia.controllers;

import com.projeto.academia.entities.Atividade;
import com.projeto.academia.repositories.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="atividades")
public class AtividadeController {
    @Autowired
    private AtividadeRepository repository;

    @GetMapping
    public List<Atividade> findAll() {
        return repository.findAll();
    }

    @GetMapping(value="/{id}")
    public Atividade findOne(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping
    public Atividade insert(@RequestBody Atividade atividade) {
        return repository.save(atividade);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/")
    public void update(@RequestBody Atividade atividade) {
        repository.save(atividade);
    }
}
