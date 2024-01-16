package com.projeto.academia.controllers;

import com.projeto.academia.entities.Aluno;
import com.projeto.academia.entities.Turma;
import com.projeto.academia.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="alunos")
public class AlunoController {
    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public List<Aluno> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Aluno> findOne(@PathVariable Long id) {
        Optional<Aluno> alunoOptional = repository.findById(id);
        return alunoOptional
                .map(aluno -> ResponseEntity.ok().body(aluno))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Aluno insert(@RequestBody Aluno aluno) {
        return repository.save(aluno);
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
    public ResponseEntity<String> update(@RequestBody Aluno aluno) {
        try {
            if (repository.existsById(aluno.getId())) {
                repository.save(aluno);
                return ResponseEntity.ok("Turma atualizada com sucesso");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Turma não encontrada");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao atualizar a turma");
        }
    }

}
