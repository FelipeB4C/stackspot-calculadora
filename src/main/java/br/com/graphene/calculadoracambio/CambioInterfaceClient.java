package br.com.graphene.calculadoracambio;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@FeignClient(name="consultaCambio", url="https://economia.awesomeapi.com.br/")
public interface CambioInterfaceClient {

    @GetMapping("{moedaOrigem}-{moedaDestino}/1")
    ArrayList<ApiResponse> consultaCambio(@PathVariable("moedaOrigem")String moedaOrigem,
                                         @PathVariable("moedaDestino")String moedaDestino);

}
