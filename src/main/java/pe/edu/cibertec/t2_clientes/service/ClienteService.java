package pe.edu.cibertec.t2_clientes.service;
import pe.edu.cibertec.t2_clientes.model.entity.Cliente;

import java.util.List;
public interface ClienteService {
    List<Cliente> listarClientes();
    Cliente obtenerClientePorId(Long id);
    Cliente registrarCliente(Cliente cliente);
    void eliminarCliente(Long id);
}
