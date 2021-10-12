package test.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.service.ArrayCalculation;
import io.olen4ixxx.taskarray.service.impl.ArrayCalculationService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

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
        int n = 1_000;
        int[] array = new int[n];
        Arrays.fill(array, 33);
        double expected = 33;
        CustomArray customArray = new CustomArray(array);
        double actual = arrayCalculation.averageOfElements(customArray);
        assertEquals(actual, expected, 0.001);
    }

    @Test
    public void testAverageOfElements() throws CustomArrayException {
        double expected = 30;
        double actual = arrayCalculation.averageOfElements(customArray);
        assertEquals(actual, expected, 0.001);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testAverageOfElementsException() throws CustomArrayException {
        int[] array = {};
        arrayCalculation.averageOfElements(new CustomArray(array));
    }

    @Test
    public void testMaxElement() throws CustomArrayException {
        int expected = 90;
        int actual = arrayCalculation.maxElement(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testMinElement() throws CustomArrayException {
        int expected = -30;
        int actual = arrayCalculation.minElement(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testNegativeToPositiveElementsReplacement() throws CustomArrayException {
        var expectedArray = new int[]{0, 60, 30, 90, 30};
        var expected = new CustomArray(expectedArray);
        var actualArray = new int[]{0, 60, 30, 90, -30};
        var actual = new CustomArray(actualArray);
        arrayCalculation.negativeToPositiveElementsReplacement(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testNumberOfNegativeElements() throws CustomArrayException {
        int expected = 1;
        int actual = arrayCalculation.numberOfNegativeElements(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testNumberOfPositiveElements() throws CustomArrayException {
        int expected = 3;
        int actual = arrayCalculation.numberOfPositiveElements(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testSumOfElements() throws CustomArrayException {
        int expected = 150;
        int actual = arrayCalculation.sumOfElements(customArray);
        assertEquals(actual, expected);
    }
}