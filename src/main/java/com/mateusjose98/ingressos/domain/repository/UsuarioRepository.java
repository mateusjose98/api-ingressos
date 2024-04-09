package com.mateusjose98.ingressos.domain.repository;

import com.mateusjose98.ingressos.domain.model.UsuarioDomain;
import com.mateusjose98.ingressos.infraestructure.entities.Usuario;

public interface UsuarioRepository {
    void salvar(UsuarioDomain usuario);
    UsuarioDomain buscar(Long usuarioId);
    boolean existeUsuarioComEmail(String email);
}
