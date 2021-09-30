package io.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.service.ArrayService;

public class NumberOfPositiveElementsArrayService implements ArrayService {
    @Override
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
