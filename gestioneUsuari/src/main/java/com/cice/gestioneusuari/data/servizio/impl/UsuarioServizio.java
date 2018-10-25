package com.cice.gestioneusuari.data.servizio.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cice.gestioneusuari.data.entita.UsuarioEntita;
import com.cice.gestioneusuari.data.repositorio.UsuarioRepositorio;
import com.cice.gestioneusuari.data.servizio.IUsuarioServizio;
import com.cice.gestioneusuari.data.servizio.convertitore.UsuarioConvertitore;
import com.cice.gestioneusuari.data.web.dto.UsuarioDTO;

@Service
public class UsuarioServizio implements IUsuarioServizio {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@Autowired
	private UsuarioConvertitore usuarioConvertitore;
	
	@Override
	public List<UsuarioDTO> findAllUsuario() {
		List<UsuarioDTO> usuarioDTOList=null;
		List<UsuarioEntita> usuarioEntitaList=usuarioRepositorio.findAll();
	// usuarioRepositorio.findAll().stream().map();
		usuarioDTOList=new ArrayList<>();
		for (UsuarioEntita usuarioEntita : usuarioEntitaList) {
			usuarioDTOList.add(usuarioConvertitore.UsuarioEntitaToDTO(usuarioEntita));
		}

      return usuarioDTOList;
	}

	@Override
	public Optional<UsuarioDTO> findUsuarioById(Long idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long crearUsuario(UsuarioDTO usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long eliminarUsuario(UsuarioDTO usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDTO actualizarUsuario(UsuarioDTO usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
 