package com.example.SisCad.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Cliente")
public class cadastroCliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String nome;
    private final String dataDeNascimento;
    private final String telefone1;
    private final String telefone2;
    private final boolean notificacao;
    private final String descricao;



}
