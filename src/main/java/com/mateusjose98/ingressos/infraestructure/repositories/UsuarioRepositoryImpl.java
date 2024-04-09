package com.mateusjose98.ingressos.infraestructure.repositories;

import com.mateusjose98.ingressos.domain.model.UsuarioDomain;
import com.mateusjose98.ingressos.domain.repository.UsuarioRepository;
import com.mateusjose98.ingressos.infraestructure.entities.Usuario;
import com.mateusjose98.ingressos.infraestructure.mappers.UsuarioMapper;
import com.mateusjose98.ingressos.infraestructure.repositories.jpa.UsuarioJPARepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class UsuarioRepositoryImpl implements UsuarioRepository {
    final UsuarioJPARepository usuarioJPARepository;
    final UsuarioMapper usuarioMapper;

    public UsuarioRepositoryImpl(UsuarioJPARepository usuarioJPARepository, UsuarioMapper usuarioMapper) {
        this.usuarioJPARepository = usuarioJPARepository;
        this.usuarioMapper = usuarioMapper;
    }

    @Override
    @Transactional
    public void salvar(UsuarioDomain usuario) {
        Usuario entity = usuarioMapper.toEntity(usuario);
        usuarioJPARepository.save(entity);
    }

    @Override
    public UsuarioDomain buscar(Long usuarioId) {
        return null;
    }

    @Override
    public boolean existeUsuarioComEmail(String email) {
        return usuarioJPARepository.existsByEmail(email);
    }
}
