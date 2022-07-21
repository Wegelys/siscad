package com.example.SisCad.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class endereco {

    private final String bairro;
    private final String rua;
    private  final int numero;
    private final String pontoDeReferencia;


}
