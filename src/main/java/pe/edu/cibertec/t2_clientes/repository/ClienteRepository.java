package pe.edu.cibertec.t2_clientes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.t2_clientes.model.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
