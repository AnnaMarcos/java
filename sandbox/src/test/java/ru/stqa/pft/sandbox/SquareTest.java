package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

    @Test// Test annotation tells to framework that the public void method to which it is attached can be run as a test case
    public void testArea() {//method//
        Square s = new Square(5);
        Assert.assertEquals( s.area(),25.0); //==  logic operator
    }
}
