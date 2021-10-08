package io.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.service.ArrayStream;
import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayStreamService implements ArrayStream {
    static Logger logger = LogManager.getLogger();

    public double averageOfElements(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            throw new CustomArrayException("Array is empty");
        }
        OptionalDouble average = Arrays.stream(customArray.getArray()).average();
        if (average.isEmpty()) {
            throw new CustomArrayException("Array is empty");
        }
        return average.getAsDouble();
    }

    public int maxElement(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            throw new CustomArrayException("Array is empty");
        }
        OptionalInt max = Arrays.stream(customArray.getArray()).max();
        if (max.isEmpty()) {
            throw new CustomArrayException("Array is empty");
        }
        return max.getAsInt();
    }

    public int minElement(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            throw new CustomArrayException("Array is empty");
        }
        OptionalInt min = Arrays.stream(customArray.getArray()).min();
        if (min.isEmpty()) {
            throw new CustomArrayException("Array is empty");
        }
        return min.getAsInt();
    }

    public CustomArray negativeToPositiveElementsReplacement(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            throw new CustomArrayException("Array is empty");
        }
        int[] negativeToPositive = Arrays.stream(customArray.getArray()).map(Math :: abs).toArray();
        return new CustomArray(negativeToPositive);
    }

    public int numberOfNegativeElements(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            throw new CustomArrayException("Array is empty");
        }
        long number = Arrays.stream(customArray.getArray()).filter(x -> x < 0).count();
        return (int) number;
    }

    public int numberOfPositiveElements(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            throw new CustomArrayException("Array is empty");
        }
        long number = Arrays.stream(customArray.getArray()).filter(x -> x > 0).count();
        return (int) number;
    }

    public int sumOfElements(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            throw new CustomArrayException("Array is empty");
        }
        int sum = Arrays.stream(customArray.getArray()).sum();
        return sum;
    }

    public CustomArray sortArray(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            throw new CustomArrayException("Array is empty");
        }
        int[] array = Arrays.stream(customArray.getArray()).sorted().toArray();
        return new CustomArray(array);
    }
}
