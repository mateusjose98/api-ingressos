package com.mateusjose98.ingressos.infraestructure.repositories.jpa;

import com.mateusjose98.ingressos.infraestructure.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJPARepository extends JpaRepository<Usuario, Integer> {
    boolean existsByEmail(String email);
}
