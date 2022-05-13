package br.com.fiap.truck.model.dto;

import br.com.fiap.truck.model.Cliente;
import br.com.fiap.truck.model.upgrades.*;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class UpgradeRequestDTO {

    private Cliente cliente;

    private Motor motor;

    private Cor cor;

    private Roda roda;

    private Carga cargas;

    private Eixo eixos;

    private String pesoMaximo;

    private String velMedia;
}
