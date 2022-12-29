package br.com.graphene.calculadoracambio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/conversaoCambio")
public class CambioController {

    @Autowired
    private CambioInterfaceClient cambioClient;

    @GetMapping
    public ResponseEntity<?> getCambio(@RequestBody CambioRequest request) {
        ArrayList<ApiResponse> apiResponse = cambioClient.consultaCambio(request.getMoedaOrigem(), request.getMoedaDestino());
        System.out.println(apiResponse.get(0));
        CambioCalculadoResponse cambioResponse = new CambioCalculadoResponse(apiResponse.get(0), request.getQtdParaConverter());
        return ResponseEntity.ok().body(cambioResponse);
    }

    @GetMapping("/detalhado")
    public ResponseEntity<?> getCambioDetalhado(@RequestBody CambioRequest request) {
        ArrayList<ApiResponse> apiResponse = cambioClient.consultaCambio(request.getMoedaOrigem(), request.getMoedaDestino());
        System.out.println(apiResponse.get(0));
        CambioCalculadoResponse cambioResponse = new CambioCalculadoResponse(apiResponse.get(0), request.getQtdParaConverter());
        return ResponseEntity.ok().body(cambioResponse);
    }

}
