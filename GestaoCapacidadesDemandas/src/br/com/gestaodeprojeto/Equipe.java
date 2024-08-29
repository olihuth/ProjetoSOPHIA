package br.com.gestaodeprojeto;

public class Equipe {
    private String id;
    private String nome;
    private String email;
    private String descricaoAtividade;
    private String cargo;

    public Equipe() {
    }

    public void mostrarInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Descrição da Atividade: " + descricaoAtividade);
        System.out.println("Cargo: " + cargo);
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getDescricaoAtividade() { return descricaoAtividade; }
    public void setDescricaoAtividade(String descricaoAtividade) { this.descricaoAtividade = descricaoAtividade; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}
