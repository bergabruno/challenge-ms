package br.com.fiap.truck.model.dto;

import br.com.fiap.truck.model.Cliente;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
public class CaminhaoRequestDTO {

    private String ano;

    private String nome;

    private String modelo;

    private String motor;

    private String cor;

    private String rodas;

    private String carga;

    private String eixo;

    private String pesoMaximo;

    private String velMedia;

}
