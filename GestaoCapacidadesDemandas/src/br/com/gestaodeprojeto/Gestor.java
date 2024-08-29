package br.com.gestaodeprojeto;

public class Gestor extends Usuario {
    private boolean permissaoParaCriarEquipe;
    private boolean permissaoParaEditarEquipe;

    // Construtor
    public Gestor(String idUsuario, String tipoUsuario, String senha, String email, String nome, boolean bloqueio, String equipe, boolean permissaoParaCriarEquipe, boolean permissaoParaEditarEquipe) {
        super(idUsuario, tipoUsuario, senha, email, nome, bloqueio, equipe);
        this.permissaoParaCriarEquipe = permissaoParaCriarEquipe;
        this.permissaoParaEditarEquipe = permissaoParaEditarEquipe;
    }

    // Getters e Setters
    public boolean isPermissaoParaCriarEquipe() {
        return permissaoParaCriarEquipe;
    }

    public void setPermissaoParaCriarEquipe(boolean permissaoParaCriarEquipe) {
        this.permissaoParaCriarEquipe = permissaoParaCriarEquipe;
    }

    public boolean isPermissaoParaEditarEquipe() {
        return permissaoParaEditarEquipe;
    }

    public void setPermissaoParaEditarEquipe(boolean permissaoParaEditarEquipe) {
        this.permissaoParaEditarEquipe = permissaoParaEditarEquipe;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("ID: " + getIdUsuario() + ", Nome: " + getNome() + ", Permissão Criar Equipe: " + permissaoParaCriarEquipe + ", Permissão Editar Equipe: " + permissaoParaEditarEquipe);
    }
}

