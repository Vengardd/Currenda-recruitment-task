package com.vengard.recrutation.service;

import com.vengard.recrutation.model.Input;
import com.vengard.recrutation.model.Rate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class NbpResponseServiceTest {


    @InjectMocks
    private NbpResponseService nbpResponseService;

    @Test
    public void getNbpResponseWithCorrectInput() {
        LocalDate startDate = LocalDate.parse("2012-01-01");
        LocalDate endDate = LocalDate.parse("2012-01-31");
        Input input = new Input("EUR", startDate, endDate);

        List<Rate> list = nbpResponseService.getRateListFromNbpResponse(input);

        assertNotNull(list);
        assertNotNull(list.get(0));
    }

}
