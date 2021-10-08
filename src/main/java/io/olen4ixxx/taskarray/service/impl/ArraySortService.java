package io.olen4ixxx.taskarray.service.impl;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.service.ArraySort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortService implements ArraySort {
    static Logger logger = LogManager.getLogger();

    public void bubbleSort(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = customArray.getArray();
        if (array.length <= 1) {
            return;
        }
        bubbleSortLogic(array);
        customArray.setArray(array);
        logger.info("CustomArray is bubble sorted");
    }

    public void selectionSort(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = customArray.getArray();
        if (array.length <= 1) {
            return;
        }
        selectionSortLogic(array);
        customArray.setArray(array);
        logger.info("CustomArray is selection sorted");
    }

    public void quickSort(CustomArray customArray) throws CustomArrayException {
        if (customArray == null || customArray.isEmpty()) {
            logger.error("Array is empty");
            throw new CustomArrayException("Array is empty");
        }
        int[] array = customArray.getArray();
        if (array.length <= 1) {
            return;
        }
        quickSortLogic(array, 0, array.length - 1);
        customArray.setArray(array);
        logger.info("CustomArray is quick sorted");
    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private void bubbleSortLogic(int[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    private void selectionSortLogic(int[] array) {
        for (int min = 0; min < array.length-1; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            swap(array, min, least);
        }
    }

    private void quickSortLogic(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    swap(source, rightMarker, leftMarker);
                }
                // moving markers
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        // recursion
        if (leftMarker < rightBorder) {
            quickSortLogic(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSortLogic(source, leftBorder, rightMarker);
        }
    }
}
