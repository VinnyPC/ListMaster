package com.listmaster.listMaster.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listmaster.listMaster.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
}
