package br.com.graphene.calculadoracambio;

import java.io.Serializable;
import java.math.BigDecimal;

public class CambioCalculadoResponse implements Serializable {

    private String moedaOrigem;

    private String moedaDestido;

    private String valorMoedaOrigem;

    private BigDecimal valorParaConverter;

    private String valorConvertido;

    public CambioCalculadoResponse(){}

    public CambioCalculadoResponse(ApiResponse apiResponse, BigDecimal valorParaConverter) {
        this.moedaOrigem = apiResponse.getCode();
        this.moedaDestido = apiResponse.getCodein();
        this.valorMoedaOrigem = apiResponse.getValorMaximoDia();
        this.valorParaConverter = valorParaConverter;
        this.valorConvertido = calculaValorCambio(valorMoedaOrigem, valorParaConverter);
    }

    private String calculaValorCambio(String valorMoedaOrigem, BigDecimal valorParaConverter){
        BigDecimal valorBigDecimal = new BigDecimal(valorMoedaOrigem);
        return valorBigDecimal.multiply(valorParaConverter).toString();
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public String getMoedaDestido() {
        return moedaDestido;
    }

    public String getValorMoedaOrigem() {
        return "1 "+moedaOrigem+" = "+ valorMoedaOrigem+" "+moedaDestido;
    }

    public String getValorParaConverter() {
        return valorParaConverter.toString()+" "+moedaOrigem;
    }

    public String getValorConvertido() {
        return valorConvertido+" "+moedaDestido;
    }
}
