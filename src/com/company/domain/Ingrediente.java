package com.company.domain;
//Ingrediente: nome(string), quantidade(double), tipo(enum);

public class Ingrediente {
    private String nome;
    private double quantidade;
    private Medida tipoDeMedida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Medida getTipoDeMedida() {
        return tipoDeMedida;
    }

    public void setTipoDeMedida(Medida tipoDeMedida) {
        this.tipoDeMedida = tipoDeMedida;
    }
}
