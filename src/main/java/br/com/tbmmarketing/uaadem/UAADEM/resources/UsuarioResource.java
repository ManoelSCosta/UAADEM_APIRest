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

import br.com.tbmmarketing.uaadem.UAADEM.models.Usuario;
import br.com.tbmmarketing.uaadem.UAADEM.repositories.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tbmmarketing/usuario")
@Api(value="UAADEM API Rest")
@CrossOrigin(origins = "*")
public class UsuarioResource {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value = "Mostra uma lista conteno todos os usuários")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/mostrar/usuario/{id}")
	@ApiOperation(value = "Mostra apenas o usuários associado ao id")
	public Usuario listarUnicoUsuario(@PathVariable(value = "id") long id) {
		return usuarioRepository.findById(id);
	}
	
	@PostMapping("/salvar")
	@ApiOperation(value = "Cadastra um usuário no sistema")
	public Usuario salvarUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping("/deletar/{id}")
	@ApiOperation(value = "Remove um usuário do sistema")
	public void deletaUsuario((@PathVariable(value = "id")long id) {
		usuarioRepository.findById(id);
	}
	
	@PutMapping("/atualizar")
	@ApiOperation(value = "Atualiza um usuário do sistema")
	public Usuario atualizarUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
}
