package io.olen4ixxx.taskarray;

import io.olen4ixxx.taskarray.service.ArraySort;
import io.olen4ixxx.taskarray.service.ArrayStream;
import io.olen4ixxx.taskarray.service.impl.ArrayStreamService;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.filereader.ArrayFileReader;
import io.olen4ixxx.taskarray.mapper.LinesToCustomArrayMapper;
import io.olen4ixxx.taskarray.service.ArrayCalculation;
import io.olen4ixxx.taskarray.service.impl.ArrayCalculationService;
import io.olen4ixxx.taskarray.service.impl.ArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws CustomArrayException {
//        int[] a = new int[]{0, 2, 3, 1, 4, -2, -1};
//
//        CustomArray customArray = new CustomArray(a);
//        System.out.println(customArray);
        ArraySort arraySort = new ArraySortService();

        ArrayFileReader arrayFileReader = new ArrayFileReader();
        LinesToCustomArrayMapper linesToCustomArrayMapper = new LinesToCustomArrayMapper();
        var customArray = linesToCustomArrayMapper.mapLinesToArray(arrayFileReader.readLines("data/array.txt"));
        System.out.println(customArray);
//        arraySort.bubbleSort(customArray);
//        arraySort.selectionSort(customArray);
//        arraySort.quickSort(customArray);
//        System.out.println(customArray);

//        ArrayStream arrayStream = new ArrayStreamService();
//        System.out.println(arrayStream.sortArray(customArray));

        ArrayStream arrayStream = new ArrayStreamService();
//        System.out.println("average: " + arrayStream.averageOfElements(customArray));
//        System.out.println("max: " + arrayStream.maxElement(customArray));
//        System.out.println("min: " + arrayStream.minElement(customArray));
//        System.out.println("change: " + arrayStream.negativeToPositiveElementsReplacement(customArray));
//        System.out.println("numberOfNegative: " + arrayStream.numberOfNegativeElements(customArray));
//        System.out.println("numberOfPositive: " + arrayStream.numberOfPositiveElements(customArray));
//        System.out.println("sum: " + arrayStream.sumOfElements(customArray));

        System.out.println();

//        customArray = null;
        ArrayCalculation arrayCalculation = new ArrayCalculationService();
//        System.out.println("average: " + arrayCalculation.averageOfElements(customArray));
//        System.out.println("max: " + arrayCalculation.maxElement(customArray));
//        System.out.println("min: " + arrayCalculation.minElement(customArray));
//        System.out.println("change: " + arrayCalculation.negativeToPositiveElementsReplacement(customArray));
//        System.out.println("numberOfNegative: " + arrayCalculation.numberOfNegativeElements(customArray));
//        System.out.println("numberOfPositive: " + arrayCalculation.numberOfPositiveElements(customArray));
        System.out.println("sum: " + arrayCalculation.sumOfElements(customArray));
    }
}
