package dev.juliofonsca.rabbitmq.dto;

import java.io.Serializable;

public class EstoqueDto implements Serializable {

    private String codigoProduto;
    private int quantidade;

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
