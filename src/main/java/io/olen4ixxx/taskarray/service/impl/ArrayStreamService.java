package io.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.service.ArrayStream;
import io.olen4ixxx.taskarray.validator.CustomArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayStreamService implements ArrayStream {
    private static final Logger logger = LogManager.getLogger();
    private final CustomArrayValidator validator = new CustomArrayValidator();

    public double averageOfElements(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayStreamService: averageOfElements({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        double averageOfArrayElements = Arrays.stream(customArray.getArray()).average()
                .orElseThrow(() -> {
                    logger.error("Array is empty");
                    return new CustomArrayException();
                });
        logger.info("averageOfArrayElementsStream: {}", averageOfArrayElements);
        return averageOfArrayElements;
    }

    public int maxElement(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayStreamService: maxElement({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int maxElement = Arrays.stream(customArray.getArray()).max()
                .orElseThrow(() -> {
                    logger.error("Array is empty");
                    return new CustomArrayException();
                });
        logger.info("maxElementStream: {}", maxElement);
        return maxElement;
    }

    public int minElement(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayStreamService: minElement({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int minElement = Arrays.stream(customArray.getArray()).min()
                .orElseThrow(() -> {
                    logger.error("Array is empty");
                    return new CustomArrayException();
                });
        logger.info("minElementStream: {}", minElement);
        return minElement;
    }

    public void negativeToPositiveElementsReplacement(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayStreamService: negativeToPositiveElementsReplacement({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = Arrays.stream(customArray.getArray()).map(Math::abs).toArray();
        customArray.setArray(array);
        logger.info("negativeToPositiveElementsReplacement is done");
    }

    public int numberOfNegativeElements(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayStreamService: numberOfNegativeElements({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int numberOfNegativeElements = (int) Arrays.stream(customArray.getArray()).filter(x -> x < 0).count();
        logger.info("numberOfNegativeElementsStream: {}", numberOfNegativeElements);
        return numberOfNegativeElements;
    }

    public int numberOfPositiveElements(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayStreamService: numberOfPositiveElements({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int numberOfPositiveElements = (int) Arrays.stream(customArray.getArray()).filter(x -> x > 0).count();
        logger.info("numberOfPositiveElementsStream: {}", numberOfPositiveElements);
        return numberOfPositiveElements;
    }

    public int sumOfElements(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayStreamService: sumOfElements({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int sumOfElements = Arrays.stream(customArray.getArray()).sum();
        logger.info("sumOfElementsStream: {}", sumOfElements);
        return sumOfElements;
    }

    public void sortArray(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayStreamService: sortArray({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = Arrays.stream(customArray.getArray()).sorted().toArray();
        customArray.setArray(array);
        logger.info("CustomArray is stream sorted");
    }
}
