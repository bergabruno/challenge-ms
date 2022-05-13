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

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "upgrade")
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;
//    motor == null ? this.motor = caminhao.getMotor()
//    Um upgrade tem somente um motor, mas um motor pode estar em varios upgrades
//    vai levar o ID do motor escolhido
    @ManyToOne
    private Motor motor;

    @ManyToOne
    private Cor cor;

    @ManyToOne
    private Roda roda;

    @ManyToOne
    private Carga cargas;

    @ManyToOne
    private Eixo eixos;

    private String pesoMaximo;

    private String velMedia;
}
