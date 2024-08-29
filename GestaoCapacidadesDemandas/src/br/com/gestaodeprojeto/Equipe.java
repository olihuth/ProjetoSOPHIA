package br.com.gestaodeprojeto;

public class Equipe {
    private int idUsuario;
    private String email;
    private String nome;
    private String senioridade;
    private String codigoAtividade;
    private String descAtividade;

    // Construtor
    public Equipe(int idUsuario, String email, String nome, String senioridade, String codigoAtividade, String descAtividade) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.nome = nome;
        this.senioridade = senioridade;
        this.codigoAtividade = codigoAtividade;
        this.descAtividade = descAtividade;
    }

    // Getters e Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public String getCodigoAtividade() {
        return codigoAtividade;
    }

    public void setCodigoAtividade(String codigoAtividade) {
        this.codigoAtividade = codigoAtividade;
    }

    public String getDescAtividade() {
        return descAtividade;
    }

    public void setDescAtividade(String descAtividade) {
        this.descAtividade = descAtividade;
    }
}
