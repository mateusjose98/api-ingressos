package com.mateusjose98.ingressos.application.controllers;

public record CriacaoUsuarioRequest(String nome,
                                    String email,
                                    String senha,
                                    String login,
                                    String perfil) {
}
