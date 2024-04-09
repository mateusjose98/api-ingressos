package com.mateusjose98.ingressos.application.controllers;


import com.mateusjose98.ingressos.domain.model.UsuarioDomain;
import com.mateusjose98.ingressos.domain.service.UsuarioService;
import com.mateusjose98.ingressos.infraestructure.mappers.UsuarioMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/usuarios")
@RestController
public class UsuarioController implements UsuarioControllerDoc {
    private final UsuarioService usuarioService;
    private final UsuarioMapper usuarioMapper;

    public UsuarioController(UsuarioService usuarioService, UsuarioMapper usuarioMapper) {
        this.usuarioService = usuarioService;
        this.usuarioMapper = usuarioMapper;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void novo(@RequestBody  CriacaoUsuarioRequest criacaoUsuarioRequest) {
        UsuarioDomain usuarioDomain = usuarioMapper.requestCriacaoToDomain(criacaoUsuarioRequest);
        usuarioService.salvar(usuarioDomain);
    }
}
