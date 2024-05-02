package com.group.libraryapp.dto.calculator.response;

public class CalculatorResponse {

    private int add;
    private int muis;
    private int mult;

    public int getAdd() {
        return add;
    }

    public int getMuis() {
        return muis;
    }

    public int getMult() {
        return mult;
    }

    public CalculatorResponse(int num1, int num2) {
        this.add = num1+num2;
        this.muis = num1-num2;
        this.mult = num1*num2;
    }
}
