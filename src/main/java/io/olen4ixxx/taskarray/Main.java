package io.olen4ixxx.taskarray;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.filereader.ArrayFileReader;
import io.olen4ixxx.taskarray.mapper.LinesToCustomArrayMapper;
import io.olen4ixxx.taskarray.service.implsort.BubbleArraySortService;
import io.olen4ixxx.taskarray.service.implsort.IntStreamSortService;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, CustomArrayException {
        ArrayFileReader arrayFileReader = new ArrayFileReader();
        LinesToCustomArrayMapper linesToCustomArrayMapper = new LinesToCustomArrayMapper();
        CustomArray customArray = linesToCustomArrayMapper.mapLinesToArray(arrayFileReader.readArray());

        System.out.println(Arrays.toString(customArray.getArray()));

        BubbleArraySortService bubbleArraySortService = new BubbleArraySortService();
        bubbleArraySortService.resultArray(customArray);
        System.out.println(Arrays.toString(customArray.getArray()));
        System.out.println(Arrays.toString(bubbleArraySortService.resultArray(customArray).getArray()));

//        QuickArraySortService quickArraySortService = new QuickArraySortService();
//        quickArraySortService.resultArray(customArray);
//        System.out.println(Arrays.toString(customArray.getArray()));
//        System.out.println(Arrays.toString(quickArraySortService.resultArray(customArray).getArray()));

        IntStreamSortService intStreamSortService = new IntStreamSortService();
        intStreamSortService.resultArray(customArray);
        System.out.println(Arrays.toString(customArray.getArray()));
        System.out.println(Arrays.toString(intStreamSortService.resultArray(customArray).getArray()));
    }
}
