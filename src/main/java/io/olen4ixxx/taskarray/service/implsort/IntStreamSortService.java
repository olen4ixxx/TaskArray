package io.olen4ixxx.taskarray.service.implsort;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.service.ArraySortService;

import java.util.Arrays;

public class IntStreamSortService implements ArraySortService {
    @Override
    public CustomArray resultArray(CustomArray customArray) throws CustomArrayException {
        int[] array = Arrays.stream(customArray.getArray()).sorted().toArray();
        return new CustomArray(array);
    }
}
