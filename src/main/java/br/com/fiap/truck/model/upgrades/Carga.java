package br.com.fiap.truck.model.upgrades;

import br.com.fiap.truck.model.Upgrade;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_carga")
@Getter
@Setter
public class Carga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    @OneToMany(mappedBy = "motor", cascade = CascadeType.ALL)
    private List<Upgrade> upgrades;
}
