package io.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NegativeToPositiveElementReplacementArrayService {
    static Logger logger = LogManager.getLogger();

    public CustomArray negativeToPositiveElementReplacement(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException("Array is null");
        }
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = -array[i];
            }
        }
        return new CustomArray(array);
    }

}
