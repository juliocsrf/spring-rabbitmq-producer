package dev.juliofonsca.rabbitmq.dto;

import java.io.Serializable;

public class PrecoDto implements Serializable {

    private String codigoProduto;
    private double preco;

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
