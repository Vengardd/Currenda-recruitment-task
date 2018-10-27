package com.vengard.recrutation.service;

import com.vengard.recrutation.model.Currency;
import com.vengard.recrutation.model.Input;
import com.vengard.recrutation.model.Rate;
import org.joda.time.LocalDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class NbpResponseServiceTest {


    @InjectMocks
    private NbpResponseService nbpResponseService;

    @Test
    public void getNbpReponseWithCorrectInput() {
        Currency currency = Currency.CurrencyBuilder.aCurrency()
                .withCode("EUR")
                .build();
        LocalDate startDate = new LocalDate(2012, 1, 1);
        LocalDate endDate = new LocalDate(2012, 1, 31);
        Input input = new Input(currency, startDate, endDate);

        List<Rate> list = nbpResponseService.getRateListFromNbpResponse(input);

        assertNotNull(list);
        assertNotNull(list.get(0));
    }

}
