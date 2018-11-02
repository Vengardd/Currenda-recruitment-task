package com.vengard.recrutation.service.urlcreator;

import com.vengard.recrutation.model.Input;

public class UrlCreatorTwoDatesOneCurrency implements UrlCreator {

    @Override
    public String createUrl(Input input) {
        return "http://api.nbp.pl/api/exchangerates/rates/c/" +
                input.getCurrency() + "/" +
                input.getStartDate() + "/" +
                input.getEndDate() + "?format=json";
    }
}
