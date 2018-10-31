package com.vengard.recrutation.service;

import com.vengard.recrutation.exception.BadDataInputException;
import com.vengard.recrutation.model.Currency;
import com.vengard.recrutation.model.Input;
import com.vengard.recrutation.model.Output;
import com.vengard.recrutation.model.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeRateService {

    @Autowired
    private CurrencyService currencyService;

    @Autowired
    private NbpResponseService nbpResponseService;

    @Autowired
    private CalculateOutputService calculateOutputService;

    public Output getAverageExchangeRate(Input input) {
        Currency currency = currencyService.findCurrencyByCode(input.getCurrency());
        if (input.getStartDate().isBefore(input.getEndDate()))
            throw new BadDataInputException();
        List<Rate> list = nbpResponseService.getRateListFromNbpResponse(input);
        return new Output(calculateOutputService.calculateAverageBuyingRate(list),
                calculateOutputService.calculateDevatationSellingRate(list));
    }
}
