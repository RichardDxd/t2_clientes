package pe.edu.cibertec.t2_clientes.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t2_clientes.model.entity.Cliente;
import pe.edu.cibertec.t2_clientes.repository.ClienteRepository;
import pe.edu.cibertec.t2_clientes.service.ClienteService;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClientePorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public Cliente registrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
