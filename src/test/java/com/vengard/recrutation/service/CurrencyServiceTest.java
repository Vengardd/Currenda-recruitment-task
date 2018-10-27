package com.vengard.recrutation.service;

import com.vengard.recrutation.exception.CurrencyNotFoundException;
import com.vengard.recrutation.model.Currency;
import com.vengard.recrutation.repository.CurrencyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyServiceTest {

    @Mock
    CurrencyRepository currencyRepository;

    @InjectMocks
    CurrencyService currencyService;

    @Test
    public void findExistingCurrency() {

        when(currencyRepository.findByCode(any())).thenReturn(Optional.of(new Currency()));

        Currency currency = currencyService.findCurrencyByCode("EUR");

        assertNotNull(currency);
    }

    @Test(expected = CurrencyNotFoundException.class)
    public void throwsCurrencyNotFoundException() throws CurrencyNotFoundException {
        when(currencyRepository.findByCode(any())).thenThrow(new CurrencyNotFoundException());
        Currency currency = currencyService.findCurrencyByCode("ARO");
    }

}
