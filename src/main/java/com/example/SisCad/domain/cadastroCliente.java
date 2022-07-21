package com.example.SisCad.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class cadastroCliente {

    private final String nome;
    private final String dataDeNascimento;
    private final String telefone1;
    private final String telefone2;
    private final boolean notificacao;
    private final String descricao;



}
