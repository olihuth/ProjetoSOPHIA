package br.com.gestaodeprojeto;

public class Admin extends Gestor {
    private boolean permissaoParaDeletar;
    private boolean permissaoParaBloquear;

    // Construtor
    public Admin(String idUsuario, String tipoUsuario, String senha, String email, String nome, boolean bloqueio, String equipe, boolean permissaoParaCriarEquipe, boolean permissaoParaEditarEquipe, boolean permissaoParaDeletar, boolean permissaoParaBloquear) {
        super(idUsuario, tipoUsuario, senha, email, nome, bloqueio, equipe, permissaoParaCriarEquipe, permissaoParaEditarEquipe);
        this.permissaoParaDeletar = permissaoParaDeletar;
        this.permissaoParaBloquear = permissaoParaBloquear;
    }

    // Getters e Setters
    public boolean isPermissaoParaDeletar() {
        return permissaoParaDeletar;
    }

    public void setPermissaoParaDeletar(boolean permissaoParaDeletar) {
        this.permissaoParaDeletar = permissaoParaDeletar;
    }

    public boolean isPermissaoParaBloquear() {
        return permissaoParaBloquear;
    }

    public void setPermissaoParaBloquear(boolean permissaoParaBloquear) {
        this.permissaoParaBloquear = permissaoParaBloquear;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("ID: " + getIdUsuario() + ", Nome: " + getNome() + ", Permissão Deletar: " + permissaoParaDeletar + ", Permissão Bloquear: " + permissaoParaBloquear);
    }
}

