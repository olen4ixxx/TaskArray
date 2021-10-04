package io.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.service.ArrayIntStream;

import java.util.Arrays;

public class ArrayIntStreamService implements ArrayIntStream {
    public double averageOfElements(CustomArray customArray) {
        var average = Arrays.stream(customArray.getArray()).average();
        return average.getAsDouble();
    }
    public int maxElement(CustomArray customArray) {
        var max = Arrays.stream(customArray.getArray()).max();
        return max.getAsInt();
    }
    public int minElement(CustomArray customArray) {
        var min = Arrays.stream(customArray.getArray()).min();
        return min.getAsInt();
    }
    public CustomArray negativeToPositiveElementsReplacement(CustomArray customArray) throws CustomArrayException {
        var negativeToPositive = Arrays.stream(customArray.getArray()).map(Math :: abs).toArray();
        return new CustomArray(negativeToPositive);
    }
    public int numberOfNegativeElements(CustomArray customArray) {
        var number = Arrays.stream(customArray.getArray()).filter(x -> x < 0).count();
        return (int) number;
    }
    public int numberOfPositiveElements(CustomArray customArray) {
        var number = Arrays.stream(customArray.getArray()).filter(x -> x > 0).count();
        return (int) number;
    }
    public int sumOfElements(CustomArray customArray) {
        int sum = Arrays.stream(customArray.getArray()).sum();
        return sum;
    }
}
