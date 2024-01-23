package com.projeto.academia.controllers;

import com.projeto.academia.entities.Aluno;
import com.projeto.academia.entities.Turma;
import com.projeto.academia.repositories.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<Turma> findOne(@PathVariable Long id) {
        Optional<Turma> turmaOptional = repository.findById(id);
        return turmaOptional
                .map(turma -> ResponseEntity.ok().body(turma))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Turma> insert(@RequestBody Turma turma) {
        Turma novaTurma = repository.save(turma);
        return new ResponseEntity<>(novaTurma, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        try {
            repository.deleteById(id);
            return ResponseEntity.ok("Recurso deletado com sucesso");
        } catch (EmptyResultDataAccessException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Recurso não encontrado");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao deletar o recurso");
        }
    }

    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody Turma turma) {
        try {
            if (repository.existsById(turma.getId())) {
                repository.save(turma);
                return ResponseEntity.ok("Turma atualizada com sucesso");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Turma não encontrada");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao atualizar a turma");
        }
    }

}
