package br.com.fiap.truck.controller;

import br.com.fiap.truck.model.Upgrade;
import br.com.fiap.truck.model.dto.UpgradeRequestDTO;
import br.com.fiap.truck.service.UpgradeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/upgrade")
public class UpgradeController {

    @Autowired
    private UpgradeService upgradeService;

    @PostMapping
    public String criarUpgrade(@RequestBody @Valid UpgradeRequestDTO upgradeRequestDTO){
        Upgrade up = upgradeService.insert(upgradeRequestDTO);

        return "O id do seu Caminhao/upgrade é: " + up.getId() + "\nIrá ser encaminhado um email" +
                "no email cadastrado com as especificações do carro." ;
    }
}
