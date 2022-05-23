package br.com.fiap.truck.controller;

import br.com.fiap.truck.model.Caminhao;
import br.com.fiap.truck.model.dto.CaminhaoRequestDTO;
import br.com.fiap.truck.model.dto.CaminhaoResponseDTO;
import br.com.fiap.truck.service.CaminhaoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/caminhao")
public class CaminhaoController {

    @Autowired
    CaminhaoService caminhaoService;


    @PostMapping("/inserir")
    public CaminhaoResponseDTO inserir(@RequestBody @Valid CaminhaoRequestDTO caminhaoRequestDTO){
        ModelMapper mapper = new ModelMapper();
        Caminhao caminhao = caminhaoService.insert(caminhaoRequestDTO);
        return mapper.map(caminhao, CaminhaoResponseDTO.class);
        //nao sera usado em nosso site!
    }

    @GetMapping("/{id}")
    public CaminhaoResponseDTO obterPorCodigo(@PathVariable Integer id){
        Caminhao caminhao = caminhaoService.getById(id);

        ModelMapper mapper = new ModelMapper();
        return mapper.map(caminhao, CaminhaoResponseDTO.class);
    }

    @GetMapping
    public List<CaminhaoRequestDTO> listar(){
        List<Caminhao> caminhoes = caminhaoService.allCaminhoes();

        ModelMapper mapper = new ModelMapper();
        List<CaminhaoRequestDTO> caminhoesDTOs = new ArrayList<>();
        mapper.map(caminhoes, caminhoesDTOs);
        return caminhoesDTOs;
    }

    
    @DeleteMapping("/{id}")
    public void apagar(@PathVariable Integer id){
        caminhaoService.deleteById(id);
    }
    
}

