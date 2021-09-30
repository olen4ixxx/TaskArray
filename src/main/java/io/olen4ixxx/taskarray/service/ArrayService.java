package io.olen4ixxx.taskarray.service;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface ArrayService {
    Logger logger = LogManager.getLogger();
    int result(CustomArray customArray) throws CustomArrayException;
//    int[] resultArray(int[] array);
//    double resultDouble(int[] array);
}
