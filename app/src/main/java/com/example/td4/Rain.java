package com.example.td4;

import java.io.Serializable;

public class Rain implements Serializable {
    private float oneH;
    private float threeH;

    public Rain(float oneH, float threeH) {
        this.oneH = oneH;
        this.threeH = threeH;
    }

    public float getOneH() {
        return oneH;
    }

    public void setOneH(float oneH) {
        this.oneH = oneH;
    }

    public float getThreeH() {
        return threeH;
    }

    public void setThreeH(float threeH) {
        this.threeH = threeH;
    }
}
