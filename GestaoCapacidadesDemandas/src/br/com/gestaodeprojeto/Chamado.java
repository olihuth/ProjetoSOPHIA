package br.com.gestaodeprojeto;

import java.util.Date;

public class Chamado {
    private String idChamado;
    private String idProjeto;
    private String idUsuario;
    private String nome;
    private String moduloChamado;
    private String tipoChamado;
    private String statusChamado;
    private String moduloConsultor;
    private String complexidade;
    private int horas;
    private String tipoHoras;
    private Date exercicio;
    private int periodo;

    // Construtor
    public Chamado(String idChamado, String idProjeto, String idUsuario, String nome, String moduloChamado, String tipoChamado, String statusChamado, String moduloConsultor, String complexidade, int horas, String tipoHoras, Date exercicio, int periodo) {
        this.idChamado = idChamado;
        this.idProjeto = idProjeto;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.moduloChamado = moduloChamado;
        this.tipoChamado = tipoChamado;
        this.statusChamado = statusChamado;
        this.moduloConsultor = moduloConsultor;
        this.complexidade = complexidade;
        this.horas = horas;
        this.tipoHoras = tipoHoras;
        this.exercicio = exercicio;
        this.periodo = periodo;
    }

    // Getters e Setters
    public String getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(String idChamado) {
        this.idChamado = idChamado;
    }

    public String getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(String idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModuloChamado() {
        return moduloChamado;
    }

    public void setModuloChamado(String moduloChamado) {
        this.moduloChamado = moduloChamado;
    }

    public String getTipoChamado() {
        return tipoChamado;
    }

    public void setTipoChamado(String tipoChamado) {
        this.tipoChamado = tipoChamado;
    }

    public String getStatusChamado() {
        return statusChamado;
    }

    public void setStatusChamado(String statusChamado) {
        this.statusChamado = statusChamado;
    }

    public String getModuloConsultor() {
        return moduloConsultor;
    }

    public void setModuloConsultor(String moduloConsultor) {
        this.moduloConsultor = moduloConsultor;
    }

    public String getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(String complexidade) {
        this.complexidade = complexidade;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getTipoHoras() {
        return tipoHoras;
    }

    public void setTipoHoras(String tipoHoras) {
        this.tipoHoras = tipoHoras;
    }

    public Date getExercicio() {
        return exercicio;
    }

    public void setExercicio(Date exercicio) {
        this.exercicio = exercicio;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
}
