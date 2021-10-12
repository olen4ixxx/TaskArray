package io.olen4ixxx.taskarray.mapper;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.validator.CustomArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class LinesToCustomArrayMapper {
    private static final Logger logger = LogManager.getLogger();

    public CustomArray mapLinesToArray(List<String> lines) {
        logger.info("LinesToCustomArrayMapper: mapLinesToArray({})", lines);
        CustomArrayValidator validator = new CustomArrayValidator();
        if (validator.isEmptyOrNull(lines)) {
            logger.info("List is empty or null");
            return new CustomArray();
        }

        List<Integer> intList = new ArrayList<>();
        for (String line : lines) {
            if (validator.isLineNumeric(line)) {
                intList.add(Integer.parseInt(line));
            }
        }
        int[] array = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            array[i] = intList.get(i);
        }
        logger.info("CustomArray is ready");
        return new CustomArray(array);
    }
}
