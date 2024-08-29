package br.com.gestaodeprojeto;

import java.util.Date;

public class MainTeste {
    public static void main(String[] args) {
        // Criando um Consultor
        Consultor consultor = new Consultor("FSIM", "Consultor", "senha123", "consultor@empresa.com", "Juliana Alves", false, "Equipe A", "Sênior");
        consultor.mostrarInformacoes();

        // Criando um Gestor
        Gestor gestor = new Gestor("GESTOR1", "Gestor", "senha123", "gestor@empresa.com", "Saul Vasconcelos", false, "Equipe B", true, true);
        gestor.mostrarInformacoes();

        // Criando um Admin
        Admin admin = new Admin("ADMIN1", "Admin", "senha123", "admin@empresa.com", "Isabelle", false, "Equipe C", true, true, true, true);
        admin.mostrarInformacoes();

        // Criando uma Equipe
        Equipe equipe = new Equipe(1, "equipe@empresa.com", "Equipe A", "Sênior", "4890722-A0643", "Consultor");
        System.out.println("Equipe: " + equipe.getNome() + ", Atividade: " + equipe.getDescAtividade());

        // Criando um Projeto
        Projeto projeto = new Projeto("Projeto_01", "BBR05", "Funcional", "ABAP;BASIS;BW", "Manutenção", 100, 200000.0, new Date(), new Date());
        System.out.println("Projeto: " + projeto.getIdProjeto() + ", Descrição: " + projeto.getDescProjeto());

        // Criando um Chamado
        Chamado chamado = new Chamado("TASK105630724-1", "Projeto_01", "FSIM", "Oliver", "BI", "Suporte", "Em análise", "BI", "N1 (Júnior)", 10, "Horas normais", new Date(), 1);
        System.out.println("Chamado: " + chamado.getIdChamado() + ", Status: " + chamado.getStatusChamado());
    }
}
