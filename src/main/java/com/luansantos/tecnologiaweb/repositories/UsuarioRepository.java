package com.luansantos.tecnologiaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luansantos.tecnologiaweb.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}
