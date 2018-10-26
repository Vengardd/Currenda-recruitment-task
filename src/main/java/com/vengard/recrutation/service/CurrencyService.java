package com.vengard.recrutation.service;

import com.vengard.recrutation.exception.CurrencyNotFoundException;
import com.vengard.recrutation.model.Currency;
import com.vengard.recrutation.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;

    public Currency findCurrencyByCode(String code) {
        return currencyRepository.findByCode(code).orElseThrow(CurrencyNotFoundException::new);
    }

}
