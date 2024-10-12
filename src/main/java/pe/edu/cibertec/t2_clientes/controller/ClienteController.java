package pe.edu.cibertec.t2_clientes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.t2_clientes.model.entity.Cliente;
import pe.edu.cibertec.t2_clientes.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listar")
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    @GetMapping("/detalle/{id}")
    public Cliente obtenerClientePorId(@PathVariable Long id) {
        return clienteService.obtenerClientePorId(id);
    }

    @PostMapping("/registrar")
    public Cliente registrarCliente(@RequestBody Cliente cliente) {
        return clienteService.registrarCliente(cliente);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarCliente(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
    }
}
