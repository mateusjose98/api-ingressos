package com.mateusjose98.ingressos.infraestructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "clientes")
public class Cliente extends BaseEntity {

    private String nome;
    private String email;
    private String cpf;
    private String telefone;


}
