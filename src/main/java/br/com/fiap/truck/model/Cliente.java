package br.com.fiap.truck.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @Column(name = "numcelular")
    private String numeroCelular;

    private String email;

    @ManyToOne
    private Caminhao caminhao;

    @OneToOne(cascade = CascadeType.ALL)
    private Upgrade upgrade;
}
