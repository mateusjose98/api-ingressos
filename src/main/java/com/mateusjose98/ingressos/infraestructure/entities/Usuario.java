package com.mateusjose98.ingressos.infraestructure.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuarios")
public class Usuario extends BaseEntity{
    private String nome;
    private String login;
    private String senha;
    private String email;
    private String perfil;
    private boolean ativo;

}
