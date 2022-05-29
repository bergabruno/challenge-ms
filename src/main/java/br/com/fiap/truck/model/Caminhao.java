package br.com.fiap.truck.model;

import br.com.fiap.truck.model.upgrades.*;
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

    private String modelo;

    @ManyToOne
    private Motor motor;

    @ManyToOne
    private Cor cor;

    @ManyToOne
    private Roda rodas;

    @ManyToOne
    private Carga carga;

    @ManyToOne
    private Eixo eixo;

    private String pesoMaximo;

    private String velMedia;

    @OneToMany(mappedBy = "caminhao", cascade = CascadeType.ALL)
    private List<Cliente> clientes;
}
