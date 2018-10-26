package com.vengard.recrutation.service;

import com.vengard.recrutation.model.Input;
import com.vengard.recrutation.model.NbpResponse;
import com.vengard.recrutation.model.Rate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NbpResponseService {

    private RestTemplate restTemplate = new RestTemplate();

    public List<Rate> getRateListFromNbpResponse(Input input) {
        NbpResponse nbpResponse = restTemplate.getForObject(createURL(input), NbpResponse.class);
        return nbpResponse.getRates();
    }

    private String createURL(Input input) {
        return "http://api.nbp.pl/api/exchangerates/rates/c/" +
                input.getCurrency().getCode() + "/" +
                input.getStartDate() + "/" +
                input.getEndDate() + "/";
    }

}
