package io.olen4ixxx.taskarray.service;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;

public interface ArraySort {
    void bubbleSort(CustomArray customArray) throws CustomArrayException;

    void selectionSort(CustomArray customArray) throws CustomArrayException;

    void quickSort(CustomArray customArray) throws CustomArrayException;
}
