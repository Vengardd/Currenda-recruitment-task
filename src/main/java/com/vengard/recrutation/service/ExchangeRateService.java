package com.vengard.recrutation.service;

import com.vengard.recrutation.exception.BadDataInputException;
import com.vengard.recrutation.model.Currency;
import com.vengard.recrutation.model.Input;
import com.vengard.recrutation.model.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeRateService {

    @Autowired
    private CurrencyService currencyService;

    @Autowired
    private NbpResponseService nbpResponseService;

    public Output getAverageExchangeRate(Input input) {
        Currency currency = currencyService.findCurrencyByCode(input.getCurrency().getCode());
        if(input.getStartDate().isBefore(input.getEndDate()))
            throw new BadDataInputException();

        return new Output();
    }


}
