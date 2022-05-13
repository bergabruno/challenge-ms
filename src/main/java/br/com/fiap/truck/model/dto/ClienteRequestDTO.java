package br.com.fiap.truck.model.dto;

import br.com.fiap.truck.model.Caminhao;
import br.com.fiap.truck.model.Upgrade;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ClienteRequestDTO {

    private String nome;

    private String numeroCelular;

    private String email;

    private Caminhao caminhao;

    private Upgrade upgrade;
}
