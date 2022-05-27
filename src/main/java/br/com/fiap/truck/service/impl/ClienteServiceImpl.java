package br.com.fiap.truck.service.impl;

import br.com.fiap.truck.model.Cliente;
import br.com.fiap.truck.model.dto.ClienteRequestDTO;
import br.com.fiap.truck.repository.ClienteRepository;
import br.com.fiap.truck.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente getById(Integer id) {
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("Não existe caminhão com este ID!");
        }

        return clienteRepository.getById(id);
    }

    @Override
    public List<Cliente> allClientes() {
        List<Cliente> caminhoes = clienteRepository.findAll();

        if (caminhoes.isEmpty()) {
            throw new RuntimeException("a lista está vazia");
        }

        return caminhoes;
    }

    @Override
    public void deleteById(Integer id) {
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("Não existe caminhão com este ID!");
        }
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente insert(ClienteRequestDTO ClienteRequestDTO) {
        return null;
    }

    @Override
    public Cliente alterar(Cliente Cliente) {
        return null;
    }
}
