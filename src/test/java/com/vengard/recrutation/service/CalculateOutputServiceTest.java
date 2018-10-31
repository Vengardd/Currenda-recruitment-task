package com.vengard.recrutation.service;

import com.vengard.recrutation.model.Input;
import com.vengard.recrutation.model.Rate;
import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CalculateOutputServiceTest {

    private CalculateOutputService calculateOutputService = new CalculateOutputService();

    @InjectMocks
    private NbpResponseService nbpResponseService;

    private List<Rate> list;

    @Before
    public void init() {
        LocalDate startDate = new LocalDate(2017, 11, 20);
        LocalDate endDate = new LocalDate(2017, 11, 24);
        Input input = new Input("EUR", startDate, endDate);

        list = nbpResponseService.getRateListFromNbpResponse(input);
    }

    @Test
    public void calculateAverageBuyingRate() {
        double result = calculateOutputService.calculateAverageBuyingRate(list);
        assertEquals(result, 4.1815, 0);
    }

    @Test
    public void calculateDevatationSellingRate() {
        double result = calculateOutputService.calculateDevatationSellingRate(list);
        assertEquals(result, 0.0101, 0);
    }

}
