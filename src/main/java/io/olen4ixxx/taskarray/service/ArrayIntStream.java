package io.olen4ixxx.taskarray.service;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;

public interface ArrayIntStream {
    double averageOfElements(CustomArray customArray);
    int maxElement(CustomArray customArray);
    int minElement(CustomArray customArray);
    CustomArray negativeToPositiveElementsReplacement(CustomArray customArray) throws CustomArrayException;
    int numberOfNegativeElements(CustomArray customArray);
    int numberOfPositiveElements(CustomArray customArray);
    int sumOfElements(CustomArray customArray);
}
