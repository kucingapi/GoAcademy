package com.goacademy.ub;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Control control = new Control();

    @Before
    public void setup() {
        control = new Control();
        control.result = 0.0;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void whenAdd1controlShouldPrintOne() {
        control.processInput("add 1");
        Assert.assertEquals("1.0\r\n", outContent.toString());
    }

    @Test
    public void whenSubtract1controlShouldPrintNegativeOne() {
        control.processInput("subtract 1");
        Assert.assertEquals("-1.0\r\n", outContent.toString());
    }

    @Test
    public void whenAdd5AndMultiply2ShouldPrint5And10() {
        control.processInput("add 5");
        control.processInput("multiply 2");
        Assert.assertEquals("5.0\r\n10.0\r\n", outContent.toString());
    }

    @Test
    public void whenAdd10AndDivide2ShouldPrint10And5() {
        control.processInput("add 10");
        control.processInput("divide 2");
        Assert.assertEquals("10.0\r\n5.0\r\n", outContent.toString());
    }

    @Test
    public void whenResetShouldResetToZero() {
        control.processInput("reset");
        Assert.assertEquals("0.0\r\n", outContent.toString());
    }
}
