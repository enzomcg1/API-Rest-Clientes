package com.erg.clientes.service.impl;

import com.erg.clientes.model.Cliente;
import com.erg.clientes.repository.ClienteRepository;
import com.erg.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repo;

    @Override
    public Cliente guardar(Cliente cliente) {
        return repo.save(cliente);
    }

    @Override
    public List<Cliente> listar() {
        return repo.findAll();
    }

    @Override
    public Optional<Cliente> buscarPorId(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Cliente> buscarPorNombre(String nombre) {
        return repo.findByNombreContainingIgnoreCase(nombre);
    }

    @Override
    public Cliente actualizar(Long id, Cliente cliente) {
        cliente.setId(id);
        return repo.save(cliente);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
