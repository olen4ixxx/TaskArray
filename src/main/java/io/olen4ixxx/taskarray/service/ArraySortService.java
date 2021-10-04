package io.olen4ixxx.taskarray.service;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;

public interface ArraySortService {
    public CustomArray resultArray(CustomArray customArray) throws CustomArrayException;
}
