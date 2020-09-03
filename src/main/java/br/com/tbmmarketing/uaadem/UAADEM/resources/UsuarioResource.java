package br.com.tbmmarketing.uaadem.UAADEM.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tbmmarketing.uaadem.UAADEM.models.Usuario;
import br.com.tbmmarketing.uaadem.UAADEM.repositories.UsuarioRepository;

@RestController
@RequestMapping("/tbmmarketing/usuario")
public class UsuarioResource {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/listar")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/mostrar/{id}")
	public Usuario listarUnicoUsuario(@PathVariable(value = "id") long id) {
		return usuarioRepository.findById(id);
	}
	
	@PostMapping("/salvar")
	public Usuario salvarUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping("/deletar")
	public void deletaUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	@PutMapping("/atualizar")
	public Usuario atualizarUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
}
