package com.mateusjose98.ingressos.infraestructure.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Getter
@Setter
@MappedSuperclass
@EqualsAndHashCode(of = "id")
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private OffsetDateTime criadaEm;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private OffsetDateTime atualizadaEm;


}
