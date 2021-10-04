package test.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.service.ArrayService;
import io.olen4ixxx.taskarray.service.impl.MaxElementArrayService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MaxElementArrayServiceTest {

    @Test(expectedExceptions = CustomArrayException.class)
    public void exceptionTest() throws CustomArrayException {
        int[] array = {};
        CustomArray customArray = new CustomArray(array);
    }

    @Test(timeOut = 1000)
    public void maxElementTest() throws CustomArrayException {
        int[] array = new int[10000];
        int expected = 9999;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        CustomArray customArray = new CustomArray(array);
        ArrayService maxElementArrayServiceTest = new MaxElementArrayService();
        int actual = maxElementArrayServiceTest.result(customArray);
        assertEquals(actual, expected, 0.01);
    }
}