package br.com.tbmmarketing.uaadem.UAADEM.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tbmmarketing.uaadem.UAADEM.models.Evento;
import br.com.tbmmarketing.uaadem.UAADEM.repositories.EventoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tbmmarketing/evento")
@Api(value="UAADEM API REST")
@CrossOrigin(origins="*")
public class EventoResource {
	@Autowired
	private EventoRepository eventoRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value="Mostra uma lista de todos os eventos salvos no sistema")
	public List<Evento> getAllEventos(){
		return eventoRepository.findAll();
	}
	
	@GetMapping("/mostrar/{id}")
	@ApiOperation(value="Mostra apenas um evento de acordo com o id")
	public Evento getUnicoEvento(@PathVariable(value="id") long id){
		return eventoRepository.findById(id);
	}
	
	@PostMapping("/salvar")
	@ApiOperation(value="Cadastra um evento no sistema")
	public Evento salvarEvento(@RequestBody Evento evento) {
		return eventoRepository.save(evento);
	}
	@DeleteMapping("/deletar/{id}")
	@ApiOperation(value="Remove um evento do sistema")
	public void deletaEvento(@PathVariable(value="id") long id) {
		 eventoRepository.delete(eventoRepository.findById(id));
	}
	
	@PutMapping("/atualizar")
	@ApiOperation(value="Atualiza um evento do sistema")
	public Evento atualizaEvento(@RequestBody Evento evento) {
		return eventoRepository.save(evento);
	}
	
	
}
