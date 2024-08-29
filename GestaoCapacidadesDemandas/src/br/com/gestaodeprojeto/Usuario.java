package br.com.gestaodeprojeto;

public abstract class Usuario {
    private String idUsuario;
    private String tipoUsuario;
    private String senha;
    private String email;
    private String nome;
    private boolean bloqueio;
    private String equipe;

    // Construtor
    public Usuario(String idUsuario, String tipoUsuario, String senha, String email, String nome, boolean bloqueio, String equipe) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.bloqueio = bloqueio;
        this.equipe = equipe;
    }

    // Getters e Setters
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(boolean bloqueio) {
        this.bloqueio = bloqueio;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    // Método abstrato para definir regras específicas de cada tipo de usuário
    public abstract void mostrarInformacoes();
}
