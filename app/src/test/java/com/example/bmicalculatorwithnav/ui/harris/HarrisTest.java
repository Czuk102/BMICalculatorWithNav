package com.example.bmicalculatorwithnav.ui.harris;


import org.junit.Assert;
import org.junit.Test;

public class HarrisTest {
    private final nav_harris testObject = new nav_harris();
    @Test
    public void shouldReturnCorrectBmrForAverageFemale() {
        // Arrange
        float weight = 50;
        float height = 160;
        float age = 20;
        String gender = "F";

        // Act
        float actual = testObject.calculateBMR(weight, height, age, gender);
        float expected = 1335;
        //Assert +-5
        Assert.assertEquals(expected, actual, 5);
    }
    @Test
    public void shouldReturnCorrectBmrForAverageMale() {
        // Arrange
        float weight = 80;
        float height = 180;
        float age = 20;
        String gender = "M";

        // Act
        float actual = testObject.calculateBMR(weight, height, age, gender);
        float expected = 1930;
        //Assert +-5
        Assert.assertEquals(expected, actual, 5);
    }

    @Test
    public void shouldReturnZeroIfGenderIsEmptyString() {
        // Arrange
        float weight = 80;
        float height = 180;
        float age = 20;
        String gender = "";

        // Act
        float actual = testObject.calculateBMR(weight, height, age, gender);
        float expected = 0;
        //Assert +-5
        Assert.assertEquals(expected, actual, 5);
    }



}