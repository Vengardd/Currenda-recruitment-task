package com.vengard.recrutation.service;

import com.vengard.recrutation.model.Input;
import com.vengard.recrutation.model.Rate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
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
        LocalDate startDate = LocalDate.parse("2017-01-01");
        LocalDate endDate = LocalDate.parse("2017-01-31");
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
        double result = calculateOutputService.calculateDeviationSellingRate(list);
        assertEquals(result, 0.0101, 0);
    }

}
