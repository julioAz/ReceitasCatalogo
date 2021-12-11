package com.company.domain;
// nome (string), categoria(enum), Tempo de preparo(double),
// rendimento(classe), Ingrediente(classe), Preparo(classe)

public class Receita {
    private String nome;
    private Categoria categoria;
    private double tempoDePreparo;
    private Rendimento rendimento;
    private Preparo preparo;
    private Ingrediente[] ingredientes;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(double tempoDePreparo) {
        if(tempoDePreparo > 0) {
            this.tempoDePreparo = tempoDePreparo;
        }
    }

    public Rendimento getRendimento() {
        return rendimento;
    }

    public void setRendimento(Rendimento rendimento) {
        this.rendimento = rendimento;
    }

    public Preparo getPreparo() {
        return preparo;
    }

    public void setPreparo(Preparo preparo) {
        this.preparo = preparo;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }
}
