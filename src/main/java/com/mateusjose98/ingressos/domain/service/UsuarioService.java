package com.mateusjose98.ingressos.domain.service;

import com.mateusjose98.ingressos.domain.exceptions.RegraNegocioException;
import com.mateusjose98.ingressos.domain.model.UsuarioDomain;
import com.mateusjose98.ingressos.domain.repository.UsuarioRepository;

public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void salvar(UsuarioDomain usuario) {
        if(usuarioRepository.existeUsuarioComEmail(usuario.getEmail())) {
            throw new RegraNegocioException("Já existe um usuário com o e-mail informado.");
        }
        usuario.ativar();
        usuarioRepository.salvar(usuario);
    }

}
