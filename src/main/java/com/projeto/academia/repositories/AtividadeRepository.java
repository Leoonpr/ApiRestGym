package com.projeto.academia.repositories;

import com.projeto.academia.entities.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtividadeRepository extends JpaRepository <Atividade, Long> {
}
