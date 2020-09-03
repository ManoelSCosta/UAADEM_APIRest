package br.com.tbmmarketing.uaadem.UAADEM.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tbmmarketing.uaadem.UAADEM.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findById(long id);

}
