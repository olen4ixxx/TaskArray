package test.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.service.ArrayCalculation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.olen4ixxx.taskarray.service.impl.ArrayCalculationService;

import java.util.Arrays;

import static org.testng.Assert.*;

public class ArrayCalculationServiceTest {
    ArrayCalculation arrayCalculation;
    CustomArray customArray;
    int[] array;

    @BeforeClass
    public void setUp() {
        arrayCalculation = new ArrayCalculationService();
        array = new int[]{0, 60, 30, 90, -30};
        customArray = new CustomArray(array);
    }

    @Test(timeOut = 100)
    public void testSumOfElementsTimeOut() throws CustomArrayException {
        int n = 1000;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        double expected = n * (n - 1) / 2.0;
        CustomArray customArray = new CustomArray(array);
        double actual = arrayCalculation.sumOfElements(customArray);
        assertEquals(actual, expected, 0.001);
    }

    @Test(timeOut = 100)
    public void testAverageOfElementsTimeOut() throws CustomArrayException {
        int n = 1_000_000;
        int[] array = new int[n];
        Arrays.fill(array, 33);
        double expected = 33;
        CustomArray customArray = new CustomArray(array);
        double actual = arrayCalculation.averageOfElements(customArray);
        assertEquals(actual, expected, 0.001);
    }

    @Test
    public void testAverageOfElements() throws CustomArrayException {
        double actual = arrayCalculation.averageOfElements(customArray);
        double expected = 30;
        assertEquals(actual, expected, 0.001);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testAverageOfElementsException() throws CustomArrayException {
        int[] array = {};
        arrayCalculation.averageOfElements(new CustomArray(array));
    }

    @Test
    public void testMaxElement() throws CustomArrayException {
        int actual = arrayCalculation.maxElement(customArray);
        int expected = 90;
        assertEquals(actual, expected);
    }

    @Test
    public void testMinElement() throws CustomArrayException {
        int actual = arrayCalculation.minElement(customArray);
        int expected = -30;
        assertEquals(actual, expected);
    }

    @Test
    public void testNegativeToPositiveElementsReplacement() throws CustomArrayException {
        CustomArray actual = arrayCalculation.negativeToPositiveElementsReplacement(customArray);
        var expectedArray = new int[]{0, 60, 30, 90, 30};
        var expected = new CustomArray(expectedArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testNumberOfNegativeElements() throws CustomArrayException {
        int actual = arrayCalculation.numberOfNegativeElements(customArray);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void testNumberOfPositiveElements() throws CustomArrayException {
        int actual = arrayCalculation.numberOfPositiveElements(customArray);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void testSumOfElements() throws CustomArrayException {
        int actual = arrayCalculation.sumOfElements(customArray);
        int expected = 150;
        assertEquals(actual, expected);
    }
}