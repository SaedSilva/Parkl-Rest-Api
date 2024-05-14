package com.saed.demoparkapi.repository;

import com.saed.demoparkapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}