package com.devesta.i5course.javaFX.lab.ex1;

public class TemperatureConverter {

    public float celsiusToFahrenheit(float celsius){
        return (celsius * 9/5) + 32;
    }

    public float fahrenheitToCelsius(float fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

}
