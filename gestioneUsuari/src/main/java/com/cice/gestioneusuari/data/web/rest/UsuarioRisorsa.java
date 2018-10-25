package com.cice.gestioneusuari.data.web.rest;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cice.gestioneusuari.data.web.dto.UsuarioDTO;

@RestController
//@RequestMapping(path="/usuarios")
public class UsuarioRisorsa {
	@RequestMapping(method=RequestMethod.GET, path="/usuarios")
	public List<UsuarioDTO> findAllUser(){
		List<UsuarioDTO> listaUsuarios=null;
		
		return listaUsuarios;
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/usuarios/{id}")
	public UsuarioDTO findUserById(@PathVariable(name="id")long id) {
		UsuarioDTO usuarioDTO=null;
		
		return usuarioDTO;
				}
	
	@RequestMapping(method=RequestMethod.POST, path="/usuarios")
	public UsuarioDTO insertUser(@RequestBody UsuarioDTO usuarioDTO) {
		UsuarioDTO usuario=null;
		return usuario;
	}
	
	@RequestMapping(method=RequestMethod.PUT, path="/usuarios/{id}")
	public UsuarioDTO updateUser(@PathVariable(name="id")Long id, UsuarioDTO usuarioDTO) {
		UsuarioDTO usuario=null;
		return usuario;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, path="/usuarios/{id}")
	public void deleteUser(@PathVariable(name="id")long id) {
		
	}

}
