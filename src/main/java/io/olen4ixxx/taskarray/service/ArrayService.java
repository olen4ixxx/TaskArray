package io.olen4ixxx.taskarray.service;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface ArrayService {
    int result(CustomArray customArray) throws CustomArrayException;
//    int[] resultArray(int[] array.txt);
//    double resultDouble(int[] array.txt);
}
