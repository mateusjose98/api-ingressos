package com.mateusjose98.ingressos.domain.model;

public class UsuarioDomain {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String login;
    private String perfil;
    private boolean ativo;

    @Deprecated
    public UsuarioDomain() {
        throw new RuntimeException("Não é permitido criar um usuário sem dados");
    }

    public UsuarioDomain(Long id, String nome, String email, String senha, String login, String perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.login = login;
        this.perfil = perfil;
    }

    public UsuarioDomain(String nome, String email, String senha, String login, String perfil) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.login = login;
        this.perfil = perfil;
    }

    private void validate() {
        if (this.nome == null || this.nome.isBlank()) {
            throw new RuntimeException("Nome do usuário é obrigatório");
        }
        if (this.email == null || this.email.isBlank()) {
            throw new RuntimeException("Email do usuário é obrigatório");
        }
        if (this.senha == null || this.senha.isBlank()) {
            throw new RuntimeException("Senha do usuário é obrigatória");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPerfil() {
        return perfil;
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UsuarioDomain{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", senha='").append(senha).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
