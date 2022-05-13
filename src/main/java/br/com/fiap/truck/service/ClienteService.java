package br.com.fiap.truck.service;

import br.com.fiap.truck.model.Cliente;
import br.com.fiap.truck.model.dto.ClienteRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

    Cliente getById(Integer id);

    List<Cliente> allClientes();

    void deleteById(Integer id);

    Cliente insert(ClienteRequestDTO ClienteRequestDTO);

    Cliente alterar(Cliente Cliente);

}
