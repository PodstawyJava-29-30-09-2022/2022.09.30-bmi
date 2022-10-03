package com.comarch.bmi;

public class BMI {
    int height;
    int weight;
    double bmi;
    int id;

    public BMI(double height, int weight, double bmi, int id) {
        this.height = (int) height;
        this.weight = weight;
        this.bmi = bmi;
        this.id = id;
    }
}
