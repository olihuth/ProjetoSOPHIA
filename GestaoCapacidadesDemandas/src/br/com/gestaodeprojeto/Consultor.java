package br.com.gestaodeprojeto;

public class Consultor extends Usuario {
    private String senioridade;

    // Construtor
    public Consultor(String idUsuario, String tipoUsuario, String senha, String email, String nome, boolean bloqueio, String equipe, String senioridade) {
        super(idUsuario, tipoUsuario, senha, email, nome, bloqueio, equipe);
        this.senioridade = senioridade;
    }

    // Getters e Setters
    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("ID: " + getIdUsuario() + ", Nome: " + getNome() + ", Senioridade: " + senioridade);
    }
}

