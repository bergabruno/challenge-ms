package br.com.fiap.truck.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_caminhao")
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Caminhao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ano;

    private String nome;

    //Atributos padrão de um caminhao: - caso queira upgrade -> upgrade (nao altera no banco)

    private String modelo;

    private String motor;

    private String cor;

    private String rodas;

    private String carga;

    private String eixo;

    private String pesoMaximo;

    private String velMedia;

    //um caminhao pode ter varios clientes
    private List<Cliente> clientes;

    private Upgrade upgrade;

}
