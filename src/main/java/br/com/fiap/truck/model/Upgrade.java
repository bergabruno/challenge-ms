package br.com.fiap.truck.model;

import br.com.fiap.truck.model.upgrades.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_upgrade")
@Getter
@Setter
public class Upgrade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Caminhao caminhao;

    private Cliente cliente;

//    if motor == null ? this.motor = caminhao.getMotor()
//    Um upgrade tem somente um motor, mas um motor pode estar em varios upgrades
//    vai levar o ID do motor escolhido
//    @OneToMany
    private Motor motor;

    private Cor cor;

    private Roda roda;

    private Carga cargas;

    private Eixo eixos;

    private String pesoMaximo;

    private String velMedia;
}
