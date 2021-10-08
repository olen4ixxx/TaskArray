package io.olen4ixxx.taskarray.mapper;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.validator.CustomArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class LinesToCustomArrayMapper {
    static Logger logger = LogManager.getLogger();

    public CustomArray mapLinesToArray(List<String> lines) throws CustomArrayException {
        if (lines.isEmpty() || lines == null) {
            logger.error("No data");
            throw new CustomArrayException("No data");
        }
        CustomArrayValidator validator = new CustomArrayValidator();
        List<Integer> intList = new ArrayList<>();
        for (String line : lines) {
            if (line != null && validator.isNumeric(line)) {
                intList.add(Integer.parseInt(line));
            }
        }
        if (intList.isEmpty() || intList == null) {
            logger.error("No data");
            throw new CustomArrayException("No data");
        }
        int[] array = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            array[i] = intList.get(i);
        }
        logger.info("CustomArray is ready");
        return new CustomArray(array);
    }
}
