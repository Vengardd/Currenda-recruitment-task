package com.vengard.recrutation.model;

public class Output {

    private float averageBuyingRate;
    private float standardDeviationSellingRate;

    public Output() {
    }

    public Output(float averageBuyingRate, float standardDeviationSellingRate) {
        this.averageBuyingRate = averageBuyingRate;
        this.standardDeviationSellingRate = standardDeviationSellingRate;
    }

    public float getAverageBuyingRate() {
        return averageBuyingRate;
    }

    public float getStandardDeviationSellingRate() {
        return standardDeviationSellingRate;
    }
}
