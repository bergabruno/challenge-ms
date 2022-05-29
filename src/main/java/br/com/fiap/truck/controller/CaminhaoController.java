package br.com.fiap.truck.controller;

import br.com.fiap.truck.model.Caminhao;
import br.com.fiap.truck.model.dto.CaminhaoRequestDTO;
import br.com.fiap.truck.model.dto.CaminhaoResponseDTO;
import br.com.fiap.truck.service.CaminhaoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
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
    public ModelAndView listar(){
        ModelAndView mav = new ModelAndView("index.html");
//        List<Caminhao> caminhoes = caminhaoService.allCaminhoes();

        ModelMapper mapper = new ModelMapper();
        List<Caminhao> caminhoesDTOs = new ArrayList<>();
//        mapper.map(caminhoes, caminhoesDTOs);
//        return caminhoesDTOs;
        Caminhao caminhaoRequestDTO = new Caminhao(1, "2030", "V8", "V8", null, null,
                null, null, null, "teste", "teste", null);
        Caminhao caminhaoRequestDTO2 = new Caminhao(1, "2050", "V8", "V8", null, null,
                null, null, null, "teste", "teste", null);
        Caminhao caminhaoRequestDTO3 = new Caminhao(1, "2040", "V8", "V8", null, null,
                null, null, null, "teste", "teste", null);
        caminhoesDTOs.addAll(Arrays.asList(caminhaoRequestDTO, caminhaoRequestDTO2, caminhaoRequestDTO3));

        //Professor queria que a cada 3 ele gerasse uma nova div da lista, para criar la um novo
        mav.addObject("getCaminhoes", caminhoesDTOs);
        return mav;

    }

    
    @DeleteMapping("/{id}")
    public void apagar(@PathVariable Integer id){
        caminhaoService.deleteById(id);
    }
    
}

