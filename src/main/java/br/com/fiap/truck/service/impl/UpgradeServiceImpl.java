package br.com.fiap.truck.service.impl;

import br.com.fiap.truck.model.Upgrade;
import br.com.fiap.truck.model.dto.UpgradeRequestDTO;
import br.com.fiap.truck.repository.UpgradeRepository;
import br.com.fiap.truck.service.UpgradeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UpgradeServiceImpl implements UpgradeService {

    @Autowired
    private UpgradeRepository upgradeRepository;

    @Override
    public Upgrade getById(Integer id) {
        if (!upgradeRepository.existsById(id)) {
            throw new RuntimeException("Não existe caminhão com este ID!");
        }

        return upgradeRepository.getById(id);
    }

    @Override
    public List<Upgrade> allUpgrades() {
        List<Upgrade> caminhoes = upgradeRepository.findAll();

        if (caminhoes.isEmpty()) {
            throw new RuntimeException("a lista está vazia");
        }

        return caminhoes;
    }

    @Override
    public void deleteById(Integer id) {
        if (!upgradeRepository.existsById(id)) {
            throw new RuntimeException("Não existe caminhão com este ID!");
        }
        upgradeRepository.deleteById(id);
    }

    @Override
    public Upgrade insert(UpgradeRequestDTO upgradeRequestDTO) {
        ModelMapper mapper = new ModelMapper();
        if (upgradeRequestDTO == null || upgradeRequestDTO.getCliente().getCaminhao() == null) {
            throw new RuntimeException("Poxa, o cliente nao possui nenhum caminhao!");
        }
        Upgrade upgrade = mapper.map(upgradeRequestDTO, Upgrade.class);
        upgrade = upgradeRepository.save(upgrade);

        return upgrade;
    }

    @Override
    public Upgrade alterar(Upgrade Upgrade) {
        return null;
    }
}
