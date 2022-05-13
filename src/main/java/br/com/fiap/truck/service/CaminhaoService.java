package br.com.fiap.truck.service;

import br.com.fiap.truck.model.Caminhao;
import br.com.fiap.truck.model.dto.CaminhaoRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CaminhaoService {

    Caminhao getById(Integer id);

    List<Caminhao> allCaminhoes();

    void deleteById(Integer id);

    Caminhao insert(CaminhaoRequestDTO caminhaoRequestDTO);

    Caminhao alterar(Caminhao caminhao);
}
