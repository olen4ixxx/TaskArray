package io.olen4ixxx.taskarray.service;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;

public interface ArrayCalculation {
    double averageOfElements(CustomArray customArray) throws CustomArrayException;
    int maxElement(CustomArray customArray) throws CustomArrayException;
    int minElement(CustomArray customArray) throws CustomArrayException;
    void negativeToPositiveElementsReplacement(CustomArray customArray) throws CustomArrayException;
    int numberOfNegativeElements(CustomArray customArray) throws CustomArrayException;
    int numberOfPositiveElements(CustomArray customArray) throws CustomArrayException;
    int sumOfElements(CustomArray customArray) throws CustomArrayException;
}
