package com.cice.gestioneusuari.data.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cice.gestioneusuari.data.entita.UsuarioEntita;

@Repository
public interface UsuarioRepositorio extends JpaRepository<UsuarioEntita, Long> {

}
