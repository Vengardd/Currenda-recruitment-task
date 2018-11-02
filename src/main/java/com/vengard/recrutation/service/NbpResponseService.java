package com.vengard.recrutation.service;

import com.vengard.recrutation.exception.NoDataException;
import com.vengard.recrutation.model.Input;
import com.vengard.recrutation.model.NbpResponse;
import com.vengard.recrutation.model.Rate;
import com.vengard.recrutation.service.urlcreator.UrlCreator;
import com.vengard.recrutation.service.urlcreator.UrlCreatorTwoDatesOneCurrency;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NbpResponseService {

    private RestTemplate restTemplate = new RestTemplate();
    private UrlCreator urlCreator = new UrlCreatorTwoDatesOneCurrency();

    public List<Rate> getRateListFromNbpResponse(Input input) {
        NbpResponse nbpResponse = restTemplate.getForObject(urlCreator.createUrl(input), NbpResponse.class);
        if(nbpResponse == null)
            throw new NoDataException();
        return nbpResponse.getRates();
    }
}
