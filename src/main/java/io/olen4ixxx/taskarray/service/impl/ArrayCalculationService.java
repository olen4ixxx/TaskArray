package io.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.service.ArrayCalculation;
import io.olen4ixxx.taskarray.validator.CustomArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculationService implements ArrayCalculation {
    private static final Logger logger = LogManager.getLogger();
    private final CustomArrayValidator validator = new CustomArrayValidator();

    public double averageOfElements(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayCalculationService: averageOfElements({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = customArray.getArray();
        double averageOfArrayElements = (double) sumOfElements(customArray) / array.length;
        logger.info("averageOfArrayElements: {}", averageOfArrayElements);
        return averageOfArrayElements;
    }

    public int maxElement(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayCalculationService: maxElement({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = customArray.getArray();
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        logger.info("maxElement: {}", maxElement);
        return maxElement;
    }

    public int minElement(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayCalculationService: minElement({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = customArray.getArray();
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        logger.info("minElement: {}", minElement);
        return minElement;
    }

    public void negativeToPositiveElementsReplacement(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayCalculationService: negativeToPositiveElementsReplacement({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = -array[i];
            }
        }
        customArray.setArray(array);
        logger.info("negativeToPositiveElementsReplacement is done");
    }

    public int numberOfNegativeElements(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayCalculationService: numberOfNegativeElements({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = customArray.getArray();
        int numberOfNegativeElements = 0;
        for (int element : array) {
            if (element < 0) {
                numberOfNegativeElements++;
            }
        }
        logger.info("numberOfNegativeElements: {}", numberOfNegativeElements);
        return numberOfNegativeElements;
    }

    public int numberOfPositiveElements(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayCalculationService: numberOfPositiveElements({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = customArray.getArray();
        int numberOfPositiveElements = 0;
        for (int element : array) {
            if (element > 0) {
                numberOfPositiveElements++;
            }
        }
        logger.info("numberOfPositiveElements: {}", numberOfPositiveElements);
        return numberOfPositiveElements;
    }

    public int sumOfElements(CustomArray customArray) throws CustomArrayException {
        logger.info("ArrayCalculationService: sumOfElements({})", customArray);
        if (validator.isEmptyOrNull(customArray)) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int sumOfElements = 0;
        for (int element : customArray.getArray()) {
            sumOfElements += element;
        }
        logger.info("sumOfElements: {}", sumOfElements);
        return sumOfElements;
    }
}
