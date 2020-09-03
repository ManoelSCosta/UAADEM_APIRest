package br.com.tbmmarketing.uaadem.UAADEM.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tbmmarketing.uaadem.UAADEM.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
	Evento findById(long id);
}
