package io.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;

public class SumOfElementsArrayService {

    public int result(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException("Array is null");
        }
        int[] array = customArray.getArray();
        int sumOfElements = 0;
        for (int element:array) {
            sumOfElements += element;
        }
        return sumOfElements;
    }
}
