package br.com.fiap.truck.controller;

import br.com.fiap.truck.model.Cliente;
import br.com.fiap.truck.model.dto.ClienteRequestDTO;
import br.com.fiap.truck.model.dto.ClienteResponseDTO;
import br.com.fiap.truck.service.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @PostMapping("/inserir")
    public ClienteResponseDTO inserir(@RequestBody @Valid ClienteRequestDTO clienteRequestDTO){
        ModelMapper mapper = new ModelMapper();
        Cliente cliente = clienteService.insert(clienteRequestDTO);
        return mapper.map(cliente, ClienteResponseDTO.class);
        //nao sera usado em nosso site!
    }

    @GetMapping("/{id}")
    public ClienteResponseDTO obterPorCodigo(@PathVariable Integer id){
        Cliente cliente = clienteService.getById(id);

        ModelMapper mapper = new ModelMapper();
        return mapper.map(cliente, ClienteResponseDTO.class);
    }

    @GetMapping
    public List<ClienteRequestDTO> listar(){
        List<Cliente> clientes = clienteService.allClientes();

        ModelMapper mapper = new ModelMapper();
        List<ClienteRequestDTO> clientesDTOs = new ArrayList<>();
        mapper.map(clientes, clientesDTOs);
        return clientesDTOs;
    }

    @DeleteMapping("/{id}")
    public void apagar(@PathVariable Integer id){
        clienteService.deleteById(id);
    }

    @GetMapping("/cadastrar")
    public ModelAndView formulario(){
        ModelAndView modelAndView = new ModelAndView("forms.html");

        return modelAndView;
    }

}
