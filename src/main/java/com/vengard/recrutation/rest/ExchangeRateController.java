package com.vengard.recrutation.rest;

import com.vengard.recrutation.model.Input;
import com.vengard.recrutation.model.Output;
import com.vengard.recrutation.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeRateController {

    @Autowired
    private ExchangeRateService exchangeRateService;

    @PostMapping
    public Output getAverageExchangeRate(@RequestBody Input input) {
        return exchangeRateService.getAverageExchangeRate(input);
    }

}
