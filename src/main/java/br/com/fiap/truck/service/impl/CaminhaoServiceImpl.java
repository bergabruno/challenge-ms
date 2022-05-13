package br.com.fiap.truck.service.impl;

import br.com.fiap.truck.model.Caminhao;
import br.com.fiap.truck.model.dto.CaminhaoRequestDTO;
import br.com.fiap.truck.repository.CaminhaoRepository;
import br.com.fiap.truck.service.CaminhaoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CaminhaoServiceImpl implements CaminhaoService {

    @Autowired
    private CaminhaoRepository caminhaoRepository;


    @Override
    public Caminhao getById(Integer id) {
        if (!caminhaoRepository.existsById(id)) {
            throw new RuntimeException("Não existe caminhão com este ID!");
        }

        return caminhaoRepository.getById(id);
    }

    @Override
    public List<Caminhao> allCaminhoes() {
        List<Caminhao> caminhoes = caminhaoRepository.findAll();

        if (caminhoes.isEmpty()) {
            throw new RuntimeException("a lista está vazia");
        }

        return caminhoes;
    }

    @Override
    public void deleteById(Integer id) {
        if (!caminhaoRepository.existsById(id)) {
            throw new RuntimeException("Não existe caminhão com este ID!");
        }
        caminhaoRepository.deleteById(id);
    }

    @Override
    public Caminhao insert(CaminhaoRequestDTO caminhaoRequestDTO) {
//        Caminhao caminhao = new Caminhao(caminhaoRequestDTO);
//
//
//        return caminhao;
        return null;
    }

    @Override
    public Caminhao alterar(Caminhao caminhao) {
        return null;
    }
}
