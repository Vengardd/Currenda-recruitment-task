package com.vengard.recrutation.service;

import com.vengard.recrutation.model.Rate;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.List;

@Service
public class CalculateOutputService {

    private static String numberFormat = "##.####";

    public double calculateAverageBuyingRate(List<Rate> rates) {
        //ToDo refactor
        return Double.parseDouble(new DecimalFormat(numberFormat).format(
                rates.stream()
                .mapToDouble(Rate::getBuyRate)
                .average()
                .orElse(Double.NaN)));
    }

    public double calculateDevatationSellingRate(List<Rate> rates) {
        double average = getAverageSellRate(rates);
        double powdedSum = getPowdedSum(rates, average);
        return Double.parseDouble(new DecimalFormat(numberFormat).format(Math.sqrt(powdedSum / rates.size())));
    }

    private double getPowdedSum(List<Rate> rates, double average) {
        double sum = 0;
        //ToDo to lambda(?)
        for (Rate rate :
                rates) {
            sum += Math.pow(rate.getSellRate() - average, 2);
        }
        return sum;
    }


    private double getAverageSellRate(List<Rate> rates) {
        //ToDo orElseThrow(?)
        return rates.stream()
                .mapToDouble(Rate::getSellRate)
                .average()
                .orElse(Double.NaN);
    }

}
