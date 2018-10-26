package com.vengard.recrutation.model;

public class Output {

    private double averageBuyingRate;
    private double standardDeviationSellingRate;

    public Output() {
    }

    public Output(double averageBuyingRate, double standardDeviationSellingRate) {
        this.averageBuyingRate = averageBuyingRate;
        this.standardDeviationSellingRate = standardDeviationSellingRate;
    }

    public double getAverageBuyingRate() {
        return averageBuyingRate;
    }

    public double getStandardDeviationSellingRate() {
        return standardDeviationSellingRate;
    }
}
