package com.example.td4;

import java.io.Serializable;

public class Snow implements Serializable {
    private double oneH;
    private double threeH;

    public double getOneH() {
        return oneH;
    }

    public void setOneH(double oneH) {
        this.oneH = oneH;
    }

    public double getThreeH() {
        return threeH;
    }

    public void setThreeH(double threeH) {
        this.threeH = threeH;
    }

    public Snow(double oneH, double threeH) {
        this.oneH = oneH;
        this.threeH = threeH;
    }
}
