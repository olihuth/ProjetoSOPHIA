package br.com.gestaodeprojeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainTeste {
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static Map<String, Consultor> consultores = new HashMap<>();
    private static Map<String, Equipe> equipes = new HashMap<>();
    private static Map<String, Projeto> projetos = new HashMap<>();
    private static Map<String, Chamado> chamados = new HashMap<>();
    
    public static void main(String[] args) {
        dateFormat.setLenient(false);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar/Alterar Consultor");
            System.out.println("2. Cadastrar/Alterar Equipe");
            System.out.println("3. Cadastrar/Alterar Projeto");
            System.out.println("4. Cadastrar/Alterar Chamado");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o nextInt
            
            switch (opcao) {
                case 1:
                    cadastrarOuAlterarConsultor();
                    break;
                case 2:
                    cadastrarOuAlterarEquipe();
                    break;
                case 3:
                    cadastrarOuAlterarProjeto();
                    break;
                case 4:
                    cadastrarOuAlterarChamado();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
    private static void cadastrarOuAlterarConsultor() {
        System.out.println("Cadastro/Alteração de Consultor:");
        System.out.print("E-mail (ou ID para alteração): ");
        String email = scanner.nextLine();

        Consultor consultor = consultores.get(email);
        if (consultor == null) {
            // Cadastro de novo Consultor
            System.out.println("Cadastro de Novo Consultor");
            System.out.print("Senha: ");
            String senha = scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            System.out.print("Nível: ");
            String nivel = scanner.nextLine();

            while (!email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                System.out.println("E-mail inválido. Digite um e-mail válido (ex: nome.sobrenome@email.com): ");
                email = scanner.nextLine();
            }

            consultor = new Consultor();
            consultor.setEmail(email);
            consultor.setSenha(senha);
            consultor.setNome(nome);
            consultor.setCargo(cargo);
            consultor.setNivel(nivel);
            consultor.setId("C" + (consultores.size() + 1)); // ID gerado automaticamente
            consultor.setBloqueado(false);
            consultores.put(email, consultor);
        } else {
            // Alteração de Consultor existente
            System.out.println("Alteração de Consultor Existente");
            System.out.print("Deseja bloquear o consultor? (sim/não): ");
            String bloqueio = scanner.nextLine();
            consultor.setBloqueado(bloqueio.equalsIgnoreCase("sim"));
        }

        consultor.mostrarInformacoes();
    }

    private static void cadastrarOuAlterarEquipe() {
        System.out.println("Cadastro/Alteração de Equipe:");
        System.out.print("ID da Equipe (ou ID para alteração): ");
        String idEquipe = scanner.nextLine();

        Equipe equipe = equipes.get(idEquipe);
        if (equipe == null) {
            // Cadastro de nova Equipe
            System.out.println("Cadastro de Nova Equipe");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("E-mail: ");
            String email = scanner.nextLine();
            System.out.print("Descrição da Atividade: ");
            String descricaoAtividade = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            equipe = new Equipe();
            equipe.setNome(nome);
            equipe.setEmail(email);
            equipe.setDescricaoAtividade(descricaoAtividade);
            equipe.setCargo(cargo);
            equipe.setId("E" + (equipes.size() + 1)); // ID gerado automaticamente
            equipes.put(equipe.getId(), equipe);
        } else {
            // Alteração de Equipe existente
            System.out.println("Alteração de Equipe Existente");
            System.out.print("Nome: ");
            equipe.setNome(scanner.nextLine());
            System.out.print("E-mail: ");
            equipe.setEmail(scanner.nextLine());
            System.out.print("Descrição da Atividade: ");
            equipe.setDescricaoAtividade(scanner.nextLine());
            System.out.print("Cargo: ");
            equipe.setCargo(scanner.nextLine());
        }

        equipe.mostrarInformacoes();
    }

    private static void cadastrarOuAlterarProjeto() {
        System.out.println("Cadastro/Alteração de Projeto:");
        System.out.print("ID do Projeto (ou ID para alteração): ");
        String idProjeto = scanner.nextLine();

        Projeto projeto = projetos.get(idProjeto);
        if (projeto == null) {
            // Cadastro de novo Projeto
            System.out.println("Cadastro de Novo Projeto");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Categoria: ");
            String categoria = scanner.nextLine();
            System.out.print("Atividade: ");
            String atividade = scanner.nextLine();
            System.out.print("Objetivo: ");
            String objetivo = scanner.nextLine();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            System.out.print("Valor: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha após o nextDouble

            Date dataInicio = null;
            Date dataTermino = null;
            boolean dataValida = false;
            while (!dataValida) {
                try {
                    System.out.print("Data de Início (Formato: yyyy-MM-dd): ");
                    dataInicio = dateFormat.parse(scanner.nextLine());
                    System.out.print("Data de Término (Formato: yyyy-MM-dd): ");
                    dataTermino = dateFormat.parse(scanner.nextLine());
                    dataValida = true;
                } catch (ParseException e) {
                    System.out.println("Data inválida. Use o formato yyyy-MM-dd.");
                }
            }

            projeto = new Projeto();
            projeto.setNome(nome);
            projeto.setCategoria(categoria);
            projeto.setAtividade(atividade);
            projeto.setObjetivo(objetivo);
            projeto.setQuantidade(quantidade);
            projeto.setValor(valor);
            projeto.setDataInicio(dataInicio);
            projeto.setDataTermino(dataTermino);
            projeto.setId("P" + (projetos.size() + 1)); // ID gerado automaticamente
            projetos.put(projeto.getId(), projeto);
        } else {
            // Alteração de Projeto existente
            System.out.println("Alteração de Projeto Existente");
            System.out.print("Nome: ");
            projeto.setNome(scanner.nextLine());
            System.out.print("Categoria: ");
            projeto.setCategoria(scanner.nextLine());
            System.out.print("Atividade: ");
            projeto.setAtividade(scanner.nextLine());
            System.out.print("Objetivo: ");
            projeto.setObjetivo(scanner.nextLine());
            System.out.print("Quantidade: ");
            projeto.setQuantidade(scanner.nextInt());
            System.out.print("Valor: ");
            projeto.setValor(scanner.nextDouble());
            scanner.nextLine(); // Consumir a nova linha após o nextDouble

            Date dataInicio = null;
            Date dataTermino = null;
            boolean dataValida = false;
            while (!dataValida) {
                try {
                    System.out.print("Data de Início (Formato: yyyy-MM-dd): ");
                    dataInicio = dateFormat.parse(scanner.nextLine());
                    System.out.print("Data de Término (Formato: yyyy-MM-dd): ");
                    dataTermino = dateFormat.parse(scanner.nextLine());
                    dataValida = true;
                } catch (ParseException e) {
                    System.out.println("Data inválida. Use o formato yyyy-MM-dd.");
                }
            }

            projeto.setDataInicio(dataInicio);
            projeto.setDataTermino(dataTermino);
        }

        projeto.mostrarInformacoes();
    }

    private static void cadastrarOuAlterarChamado() {
        System.out.println("Cadastro/Alteração de Chamado:");
        System.out.print("ID do Chamado (ou ID para alteração): ");
        String idChamado = scanner.nextLine();

        Chamado chamado = chamados.get(idChamado);
        if (chamado == null) {
            // Cadastro de novo Chamado
            System.out.println("Cadastro de Novo Chamado");
            System.out.print("ID do Projeto: ");
            String idProjeto = scanner.nextLine();
            System.out.print("ID do Usuário: ");
            String idUsuario = scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Módulo do Chamado: ");
            String moduloChamado = scanner.nextLine();
            System.out.print("Tipo do Chamado: ");
            String tipoChamado = scanner.nextLine();
            System.out.print("Status do Chamado: ");
            String statusChamado = scanner.nextLine();
            System.out.print("Módulo do Consultor: ");
            String moduloConsultor = scanner.nextLine();
            System.out.print("Complexidade: ");
            String complexidade = scanner.nextLine();
            System.out.print("Horas: ");
            int horas = scanner.nextInt();
            System.out.print("Tipo de Horas: ");
            String tipoHoras = scanner.next();
            scanner.nextLine(); // Consumir a nova linha após o nextInt

            Date exercicio = null;
            boolean dataValida = false;
            while (!dataValida) {
                try {
                    System.out.print("Data de Exercício (Formato: yyyy-MM-dd): ");
                    exercicio = dateFormat.parse(scanner.nextLine());
                    dataValida = true;
                } catch (ParseException e) {
                    System.out.println("Data inválida. Use o formato yyyy-MM-dd.");
                }
            }

            System.out.print("Período: ");
            int periodo = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o nextInt

            chamado = new Chamado();
            chamado.setIdChamado("C" + (chamados.size() + 1)); // ID gerado automaticamente
            chamado.setIdProjeto(idProjeto);
            chamado.setIdUsuario(idUsuario);
            chamado.setNome(nome);
            chamado.setModuloChamado(moduloChamado);
            chamado.setTipoChamado(tipoChamado);
            chamado.setStatusChamado(statusChamado);
            chamado.setModuloConsultor(moduloConsultor);
            chamado.setComplexidade(complexidade);
            chamado.setHoras(horas);
            chamado.setTipoHoras(tipoHoras);
            chamado.setExercicio(exercicio);
            chamado.setPeriodo(periodo);
            chamados.put(chamado.getIdChamado(), chamado);
        } else {
            // Alteração de Chamado existente
            System.out.println("Alteração de Chamado Existente");
            System.out.print("ID do Projeto: ");
            chamado.setIdProjeto(scanner.nextLine());
            System.out.print("ID do Usuário: ");
            chamado.setIdUsuario(scanner.nextLine());
            System.out.print("Nome: ");
            chamado.setNome(scanner.nextLine());
            System.out.print("Módulo do Chamado: ");
            chamado.setModuloChamado(scanner.nextLine());
            System.out.print("Tipo do Chamado: ");
            chamado.setTipoChamado(scanner.nextLine());
            System.out.print("Status do Chamado: ");
            chamado.setStatusChamado(scanner.nextLine());
            System.out.print("Módulo do Consultor: ");
            chamado.setModuloConsultor(scanner.nextLine());
            System.out.print("Complexidade: ");
            chamado.setComplexidade(scanner.nextLine());
            System.out.print("Horas: ");
            chamado.setHoras(scanner.nextInt());
            System.out.print("Tipo de Horas: ");
            chamado.setTipoHoras(scanner.next());
            scanner.nextLine(); // Consumir a nova linha após o nextInt

            Date exercicio = null;
            boolean dataValida = false;
            while (!dataValida) {
                try {
                    System.out.print("Data de Exercício (Formato: yyyy-MM-dd): ");
                    exercicio = dateFormat.parse(scanner.nextLine());
                    dataValida = true;
                } catch (ParseException e) {
                    System.out.println("Data inválida. Use o formato yyyy-MM-dd.");
                }
            }

            chamado.setExercicio(exercicio);
            System.out.print("Período: ");
            chamado.setPeriodo(scanner.nextInt());
            scanner.nextLine(); // Consumir a nova linha após o nextInt
        }

        chamado.mostrarInformacoes();
    }
}
