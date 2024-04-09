package com.mateusjose98.ingressos.infraestructure.mappers;

import com.mateusjose98.ingressos.domain.model.UsuarioDomain;
import com.mateusjose98.ingressos.application.controllers.CriacaoUsuarioRequest;
import com.mateusjose98.ingressos.infraestructure.entities.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public UsuarioDomain requestCriacaoToDomain(CriacaoUsuarioRequest criacaoUsuarioRequest) {
        return new UsuarioDomain(
                criacaoUsuarioRequest.nome(),
                criacaoUsuarioRequest.email(),
                criacaoUsuarioRequest.senha(),
                criacaoUsuarioRequest.login(),
                criacaoUsuarioRequest.perfil());
    }

    public Usuario toEntity(UsuarioDomain usuarioDomain) {
        var result = new Usuario();
        result.setNome(usuarioDomain.getNome());
        result.setEmail(usuarioDomain.getEmail());
        result.setSenha(usuarioDomain.getSenha());
        result.setLogin(usuarioDomain.getLogin());
        result.setPerfil(usuarioDomain.getPerfil());
        return result;
    }


}
