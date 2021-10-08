package test.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.service.ArraySort;
import io.olen4ixxx.taskarray.service.impl.ArraySortService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraySortServiceTest {

    ArraySort arraySort;
    CustomArray customArraySorted;
    int[] arraySorted;

    @BeforeClass
    public void setUp() {
        arraySort = new ArraySortService();
        arraySorted = new int[]{-1, 0, 2, 10, 10};
        customArraySorted = new CustomArray(arraySorted);
    }

    @Test
    public void testBubbleSort() throws CustomArrayException {
        var array = new int[]{10, -1, 2, 10, 0};
        var customArray = new CustomArray(array);

        arraySort.bubbleSort(customArray);
        var actual = customArray;
        var expected = customArraySorted;
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() throws CustomArrayException {
        var array = new int[]{10, -1, 2, 10, 0};
        var customArray = new CustomArray(array);

        arraySort.selectionSort(customArray);
        var actual = customArray;
        var expected = customArraySorted;
        assertEquals(actual, expected);
    }

    @Test
    public void testQuickSort() throws CustomArrayException {
        var array = new int[]{10, -1, 2, 10, 0};
        var customArray = new CustomArray(array);

        arraySort.quickSort(customArray);
        var actual = customArray;
        var expected = customArraySorted;
        assertEquals(actual, expected);
    }
}