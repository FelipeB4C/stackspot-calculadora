package br.com.graphene.calculadoracambio;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ApiResponse implements Serializable {

    @JsonProperty("code")
    private String code;
    @JsonProperty("codein")
    private String codein;

    @JsonProperty("name")
    private String nomeMoedas;

    @JsonProperty("high")
    private String valorMaximoDia;

    @JsonProperty("min")
    private String valorMinimoDia;

    @JsonProperty("varBid")
    private String variacao;

    @JsonProperty("pctChange")
    private String prctgemVariacao;

    @JsonProperty("bid")
    private String valorCompra;

    @JsonProperty("ask")
    private String valorVenda;

    public ApiResponse(){}

    public ApiResponse(String code, String codein, String nomeMoedas, String valorMaximoDia, String valorMinimoDia,
                       String variacao, String prctgemVariacao, String valorCompra, String valorVenda) {
        this.code = code;
        this.codein = codein;
        this.nomeMoedas = nomeMoedas;
        this.valorMaximoDia = valorMaximoDia;
        this.valorMinimoDia = valorMinimoDia;
        this.variacao = variacao;
        this.prctgemVariacao = prctgemVariacao;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
    }

    public String getCode() {
        return code;
    }

    public String getCodein() {
        return codein;
    }

    public String getValorMaximoDia() {
        return valorMaximoDia;
    }

    public String getNomeMoedas() {
        return nomeMoedas;
    }

    public String getValorMinimoDia() {
        return valorMinimoDia;
    }

    public String getVariacao() {
        return variacao;
    }

    public String getPrctgemVariacao() {
        return prctgemVariacao;
    }

    public String getValorCompra() {
        return valorCompra;
    }

    public String getValorVenda() {
        return valorVenda;
    }
}
