package com.example.currencyconverter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConverterController {

        @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
        public CurrencyConverterBean convertCurrency(
                @PathVariable String from,
                @PathVariable String to,
                @PathVariable BigDecimal quantity
        ) {
                Map<String, String> uriVariables = new HashMap<>();
                uriVariables.put("from", from);
                uriVariables.put("to", to);

                ResponseEntity<CurrencyConverterBean> responseEntity = new RestTemplate().getForEntity(
                        "http://localhost:8091/currency-exchange/from/{from}/to/{to}",
                        CurrencyConverterBean.class,
                        uriVariables
                );

                CurrencyConverterBean response = responseEntity.getBody();

                if (response == null) {
                        // Handle the case when the response is null
                        // Return an appropriate response or throw an exception
                        throw new RuntimeException("Conversion rate not available");
                }

                return new CurrencyConverterBean(
                        response.getId(), from, to, response.getConversionMultiple(),
                        quantity, quantity.multiply(response.getConversionMultiple())
                );
        }

}
