package com.cice.gestioneusuari.data.servizio.convertitore;
import org.springframework.stereotype.Component;

import com.cice.gestioneusuari.data.entita.UsuarioEntita;
import com.cice.gestioneusuari.data.web.dto.UsuarioDTO;

@Component
public class UsuarioConvertitore {
	
	public UsuarioDTO UsuarioEntitaToDTO(UsuarioEntita usuarioEntita) {
		UsuarioDTO usuarioDTO=null;
		usuarioDTO=new UsuarioDTO(
				usuarioEntita.getId(),
				usuarioEntita.getNombre(),
				usuarioEntita.getUser(),
				usuarioEntita.getEmail()
				);
		
		return usuarioDTO;
	}
	
	public UsuarioEntita UsuarioDTOToEntity(UsuarioDTO usuarioDTO) {
		UsuarioEntita usuarioEntita=null;
		usuarioEntita=new UsuarioEntita(
				usuarioDTO.getId(),
				usuarioDTO.getNombre(),
				usuarioDTO.getUser(),
				null,
				usuarioDTO.getEmail()				
				);
		return usuarioEntita;
	}

}
