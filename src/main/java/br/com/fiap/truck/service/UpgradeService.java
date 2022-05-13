package br.com.fiap.truck.service;

import br.com.fiap.truck.model.Upgrade;
import br.com.fiap.truck.model.dto.UpgradeRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UpgradeService {

    Upgrade getById(Integer id);

    List<Upgrade> allUpgrades();

    void deleteById(Integer id);

    Upgrade insert(UpgradeRequestDTO UpgradeRequestDTO);

    Upgrade alterar(Upgrade Upgrade);
    
}
