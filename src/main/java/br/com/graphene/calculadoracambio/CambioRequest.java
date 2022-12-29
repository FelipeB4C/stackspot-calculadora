package br.com.graphene.calculadoracambio;

import java.io.Serializable;
import java.math.BigDecimal;

public class CambioRequest implements Serializable {
    private String moedaOrigem;
    private String moedaDestino;

    private BigDecimal qtdParaConverter;

    public CambioRequest(){}

    public CambioRequest(String moedaOrigem, String moedaDestino, BigDecimal qtdParaConverter) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.qtdParaConverter = qtdParaConverter;
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public BigDecimal getQtdParaConverter() {
        return qtdParaConverter;
    }
}
