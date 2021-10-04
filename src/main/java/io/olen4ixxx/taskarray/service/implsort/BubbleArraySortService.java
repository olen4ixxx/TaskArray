package io.olen4ixxx.taskarray.service.implsort;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.service.ArraySortService;

public class BubbleArraySortService implements ArraySortService {
    public CustomArray resultArray(CustomArray customArray) {
        int[] array = customArray.getArray();
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }
        return customArray;
    }

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
