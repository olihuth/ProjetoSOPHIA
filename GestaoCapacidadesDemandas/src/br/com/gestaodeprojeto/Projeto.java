package br.com.gestaodeprojeto;

import java.util.Date;

public class Projeto {
    private String id;
    private String nome;
    private String categoria;
    private String atividade;
    private String objetivo;
    private int quantidade;
    private double valor;
    private Date dataInicio;
    private Date dataTermino;

    public Projeto() {
    }

    public void mostrarInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Atividade: " + atividade);
        System.out.println("Objetivo: " + objetivo);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor: " + valor);
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Data de Término: " + dataTermino);
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public String getAtividade() { return atividade; }
    public void setAtividade(String atividade) { this.atividade = atividade; }
    public String getObjetivo() { return objetivo; }
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public Date getDataInicio() { return dataInicio; }
    public void setDataInicio(Date dataInicio) { this.dataInicio = dataInicio; }
    public Date getDataTermino() { return dataTermino; }
    public void setDataTermino(Date dataTermino) { this.dataTermino = dataTermino; }
}
