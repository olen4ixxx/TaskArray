package io.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.service.ArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumberOfNegativeElementsArrayService implements ArrayService {
    static Logger logger = LogManager.getLogger();

    @Override
    public int result(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException("Array is null");
        }
        int[] array = customArray.getArray();
        int numberOfNegativeElements = 0;
        for (int element:array) {
            if (element < 0) {
                numberOfNegativeElements++;
            }
        }
        return numberOfNegativeElements;
    }
}
