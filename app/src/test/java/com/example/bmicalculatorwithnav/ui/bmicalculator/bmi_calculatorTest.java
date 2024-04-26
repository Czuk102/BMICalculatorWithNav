package com.example.bmicalculatorwithnav.ui.bmicalculator;


import org.junit.Assert;
import org.junit.Test;

public class bmi_calculatorTest {

    bmi_calculator bmi_calculator = new bmi_calculator();

    @Test
    public void shouldReturnCorrectBMI() {
        // Arrange
        float heightInMeters = 1.8f;
        float weightInKilograms = 80;

        // Act
        float actual = bmi_calculator.calculateBMI(heightInMeters, weightInKilograms);
        float expected = 24.69f;

        // Assert
        Assert.assertEquals(expected, actual, 0.1);

    }
}