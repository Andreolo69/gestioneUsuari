package com.cice.gestioneusuari.data.servizio;

import java.util.List;
import java.util.Optional;

import com.cice.gestioneusuari.data.web.dto.UsuarioDTO;

public interface IUsuarioServizio {

	List<UsuarioDTO> findAllUsuario();
	
	Optional<UsuarioDTO> findUsuarioById(Long idUsuario);
	
	Long crearUsuario(UsuarioDTO usuario);
	
	Long eliminarUsuario(UsuarioDTO usuario);
	
	UsuarioDTO actualizarUsuario(UsuarioDTO usuario);
}
