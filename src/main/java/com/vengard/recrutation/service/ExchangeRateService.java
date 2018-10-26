package com.vengard.recrutation.service;

import com.vengard.recrutation.model.Currency;
import com.vengard.recrutation.model.Input;
import com.vengard.recrutation.model.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeRateService {

    @Autowired
    CurrencyService currencyService;

    public Output getAverageExchangeRate(Input input) {
        Currency currency = currencyService.findCurrencyByCode(input.getCurrency().getCode());
        //ToDo validate dates

        return new Output();
    }
}
