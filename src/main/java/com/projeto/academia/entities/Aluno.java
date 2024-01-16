package com.projeto.academia.entities;

import javax.persistence.*;

@Entity
@Table(name="aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private String cidade;
    @OneToOne
    @JoinColumn(name = "idturma")
    private Turma turma;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
