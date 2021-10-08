package io.olen4ixxx.taskarray.service.nonimpl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MinElementArrayCalculation {
    static Logger logger = LogManager.getLogger();

    public int result(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException("Array is null");
        }
        int[] array = customArray.getArray();
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }
}
