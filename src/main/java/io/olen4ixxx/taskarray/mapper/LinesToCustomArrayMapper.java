package io.olen4ixxx.taskarray.mapper;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;

import java.util.ArrayList;
import java.util.List;

public class LinesToCustomArrayMapper {

    public CustomArray mapLinesToArray(List<String> lines) throws CustomArrayException {
        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i) != null && isNumeric(lines.get(i))) {
                intList.add(Integer.parseInt(lines.get(i)));
            }
        }

        int[] array = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            array[i] = intList.get(i);
        }
        CustomArray customArray = new CustomArray(array);
        return customArray;
    }

    public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
