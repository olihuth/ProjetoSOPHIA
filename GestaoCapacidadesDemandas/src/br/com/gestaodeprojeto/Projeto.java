package br.com.gestaodeprojeto;

import java.util.Date;

public class Projeto {
    private String idProjeto;
    private String descProjeto;
    private String tipoProjeto;
    private String modulo;
    private String tipoDemanda;
    private int baseline;
    private double valorProjeto;
    private Date inicioContrato;
    private Date fimContrato;

    // Construtor
    public Projeto(String idProjeto, String descProjeto, String tipoProjeto, String modulo, String tipoDemanda, int baseline, double valorProjeto, Date inicioContrato, Date fimContrato) {
        this.idProjeto = idProjeto;
        this.descProjeto = descProjeto;
        this.tipoProjeto = tipoProjeto;
        this.modulo = modulo;
        this.tipoDemanda = tipoDemanda;
        this.baseline = baseline;
        this.valorProjeto = valorProjeto;
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
    }

    // Getters e Setters
    public String getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(String idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getDescProjeto() {
        return descProjeto;
    }

    public void setDescProjeto(String descProjeto) {
        this.descProjeto = descProjeto;
    }

    public String getTipoProjeto() {
        return tipoProjeto;
    }

    public void setTipoProjeto(String tipoProjeto) {
        this.tipoProjeto = tipoProjeto;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getTipoDemanda() {
        return tipoDemanda;
    }

    public void setTipoDemanda(String tipoDemanda) {
        this.tipoDemanda = tipoDemanda;
    }

    public int getBaseline() {
        return baseline;
    }

    public void setBaseline(int baseline) {
        this.baseline = baseline;
    }

    public double getValorProjeto() {
        return valorProjeto;
    }

    public void setValorProjeto(double valorProjeto) {
        this.valorProjeto = valorProjeto;
    }

    public Date getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(Date inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public Date getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(Date fimContrato) {
        this.fimContrato = fimContrato;
    }
}
