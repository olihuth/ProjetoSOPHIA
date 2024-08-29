package br.com.gestaodeprojeto;

public class Consultor {
    private String id;
    private String email;
    private String senha;
    private String nome;
    private String cargo;
    private String nivel;
    private boolean bloqueado;

    public Consultor() {
    }

    public void mostrarInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("E-mail: " + email);
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível: " + nivel);
        System.out.println("Bloqueado: " + (bloqueado ? "Sim" : "Não"));
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
    public boolean isBloqueado() { return bloqueado; }
    public void setBloqueado(boolean bloqueado) { this.bloqueado = bloqueado; }
}
