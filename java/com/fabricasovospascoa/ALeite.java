/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricasovospascoa;

/**
 *
 * @author 55649
 */
public class ALeite implements Produto {
    private String carboidratos;
    private String açucares;
    private String gorduras;
    private String peso;
    private double valor;
    private int codigo;

    public ALeite(String carboidratos, String açucares, String gorduras, String peso, double valor, int codigo) {
        this.carboidratos = carboidratos;
        this.açucares = açucares;
        this.gorduras = gorduras;
        this.peso = peso;
        this.valor = valor;
        this.codigo = codigo;
    }

    public String getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(String carboidratos) {
        this.carboidratos = carboidratos;
    }

    public String getAçucares() {
        return açucares;
    }

    public void setAçucares(String açucares) {
        this.açucares = açucares;
    }

    public String getGorduras() {
        return gorduras;
    }

    public void setGorduras(String gorduras) {
        this.gorduras = gorduras;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    @Override
    public void cod_produto(int i) {
        if (this.codigo == i) {
            System.out.println("Chocolate - Lacta - AO LEITE\n");
            System.out.println("Quantidade de Carboidratos: " + this.carboidratos);
            System.out.println("Quantidade de Açucares: " + this.açucares);
            System.out.println("Quantidade de Gorduras: " + this.gorduras);
            System.out.println("Peso: " + this.peso);
            System.out.println("Preço: R$ " + this.valor + " reais");
            System.out.println("\n ---------------------------------------------------");

        } else {
            System.out.println("Produto não encontrado na fábrica");
        }

    }
}