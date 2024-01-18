package com.devesta.i5course.javaFX.lab.ex1;

public class TemperatureController {

    private final TemperatureConverter converter = new TemperatureConverter();
    public float toFahrenheit(float celsius){
        return converter.celsiusToFahrenheit(celsius);
    }

    public float toCelsius(float fahrenheit){
        return converter.fahrenheitToCelsius(fahrenheit);
    }

}
