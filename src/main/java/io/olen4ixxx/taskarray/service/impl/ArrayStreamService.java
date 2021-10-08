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
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        OptionalDouble average = Arrays.stream(customArray.getArray()).average();
        if (average.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        var averageOfArrayElements = average.getAsDouble();
        logger.info("averageOfArrayElementsStream: " + averageOfArrayElements);
        return averageOfArrayElements;
    }

    public int maxElement(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        OptionalInt max = Arrays.stream(customArray.getArray()).max();
        if (max.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        var maxElement = max.getAsInt();
        logger.info("maxElementStream: " + maxElement);
        return maxElement;
    }

    public int minElement(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        OptionalInt min = Arrays.stream(customArray.getArray()).min();
        if (min.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        var minElement = min.getAsInt();
        logger.info("minElementStream: " + minElement);
        return minElement;
    }

    public void negativeToPositiveElementsReplacement(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = Arrays.stream(customArray.getArray()).map(Math :: abs).toArray();
        customArray.setArray(array);
        logger.info("negativeToPositiveElementsReplacement is done");
    }

    public int numberOfNegativeElements(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int numberOfNegativeElements = (int) Arrays.stream(customArray.getArray()).filter(x -> x < 0).count();
        logger.info("numberOfNegativeElementsStream: " + numberOfNegativeElements);
        return numberOfNegativeElements;
    }

    public int numberOfPositiveElements(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int numberOfPositiveElements = (int) Arrays.stream(customArray.getArray()).filter(x -> x > 0).count();
        logger.info("numberOfPositiveElementsStream: " + numberOfPositiveElements);
        return numberOfPositiveElements;
    }

    public int sumOfElements(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int sumOfElements = Arrays.stream(customArray.getArray()).sum();
        logger.info("sumOfElementsStream: " + sumOfElements);
        return sumOfElements;
    }

    public void sortArray(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = Arrays.stream(customArray.getArray()).sorted().toArray();
        customArray.setArray(array);
        logger.info("CustomArray is stream sorted");
    }
}
