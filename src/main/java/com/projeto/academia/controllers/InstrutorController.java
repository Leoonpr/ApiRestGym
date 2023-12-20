package com.projeto.academia.controllers;

import com.projeto.academia.entities.Instrutor;
import com.projeto.academia.repositories.InstrutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="instrutores")
public class InstrutorController {
    @Autowired
    private InstrutorRepository repository;

    @GetMapping
    public List<Instrutor> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Instrutor findOne(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping
    public Instrutor insert(@RequestBody Instrutor instrutor) {
        return repository.save(instrutor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/")
    public void update(@RequestBody Instrutor instrutor) {
        repository.save(instrutor);
    }

}
