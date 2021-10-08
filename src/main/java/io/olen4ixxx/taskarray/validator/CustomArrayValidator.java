package io.olen4ixxx.taskarray.validator;

import io.olen4ixxx.taskarray.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayValidator {
    static Logger logger = LogManager.getLogger();

    public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public boolean isEmpty(CustomArray customArray) {
        return customArray.getArray().length <= 0;
    }
}
