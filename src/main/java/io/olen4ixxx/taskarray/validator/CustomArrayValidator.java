package io.olen4ixxx.taskarray.validator;

import io.olen4ixxx.taskarray.entity.CustomArray;

import java.util.List;

public class CustomArrayValidator {
    public boolean isLineNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isEmptyOrNull(List<String> list) {
        return (list == null || list.isEmpty());
    }

    public boolean isEmptyOrNull(CustomArray customArray) {
        return (customArray == null || customArray.getArray().length <= 0);
    }
}
