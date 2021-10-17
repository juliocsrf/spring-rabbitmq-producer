package dev.juliofonsca.rabbitmq.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class EstoqueDto implements Serializable {

    @NotNull
    public String codigoProduto;

    @NotNull
    public int quantidade;

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
