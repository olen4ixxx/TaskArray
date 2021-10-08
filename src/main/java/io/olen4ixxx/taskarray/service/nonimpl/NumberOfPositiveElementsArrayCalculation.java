package io.olen4ixxx.taskarray.service.nonimpl;

import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumberOfPositiveElementsArrayCalculation {
    static Logger logger = LogManager.getLogger();

    public int result(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException("Array is null");
        }
        int[] array = customArray.getArray();
        int numberOfPositiveElements = 0;
        for (int element:array) {
            if (element > 0) {
                numberOfPositiveElements++;
            }
        }
        return numberOfPositiveElements;
    }
}
