package io.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AverageOfElementsArrayService {
    static Logger logger = LogManager.getLogger();

    public double averageOfArrayElements(CustomArray customArray) {
        if (customArray == null) {
            try {
                throw new CustomArrayException();
            } catch (CustomArrayException e) {
                logger.error("Array is null", e);
            }
        }
        SumOfElementsArrayService sumOfElementsArrayService = new SumOfElementsArrayService();
        int[] array = customArray.getArray();
        double averageOfArrayElements = 0;
        try {
            averageOfArrayElements = (double) sumOfElementsArrayService.result(customArray) / array.length;
        } catch (CustomArrayException e) {
            logger.error("Array is null", e);
        }
        return averageOfArrayElements;
    }
}
