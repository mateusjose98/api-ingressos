package com.mateusjose98.ingressos.infraestructure.configuration.beans;

import com.mateusjose98.ingressos.domain.service.UsuarioService;
import com.mateusjose98.ingressos.infraestructure.repositories.UsuarioRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeans {

    @Bean
    public UsuarioService serviceBean(UsuarioRepositoryImpl repositoryBean) {
        return new UsuarioService(repositoryBean);
    }
}
