package com.erg.clientes.service;

import com.erg.clientes.model.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {
    Cliente guardar(Cliente cliente);
    List<Cliente> listar();
    Optional<Cliente> buscarPorId(Long id);
    List<Cliente> buscarPorNombre(String nombre);
    Cliente actualizar(Long id, Cliente cliente);
    void eliminar(Long id);
}
