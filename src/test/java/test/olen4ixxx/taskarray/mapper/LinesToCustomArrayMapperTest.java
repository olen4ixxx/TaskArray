package test.olen4ixxx.taskarray.mapper;

import io.olen4ixxx.taskarray.entity.CustomArray;
import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.mapper.LinesToCustomArrayMapper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

public class LinesToCustomArrayMapperTest {

    LinesToCustomArrayMapper linesToCustomArrayMapper;
    String[] array;

    @BeforeClass
    public void setUp() {
        linesToCustomArrayMapper = new LinesToCustomArrayMapper();
        array = new String[]{"1", "rr", "1.0", "-2"};
    }

    @Test(timeOut = 100)
    public void testMapLinesToArray() throws CustomArrayException {
        List<String> lines = Arrays.asList(array);
        CustomArray actual = linesToCustomArrayMapper.mapLinesToArray(lines);
        var array = new int[]{1, -2};
        var expected = new CustomArray(array);
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class, expectedExceptionsMessageRegExp = "Array is empty")
    public void testMapLinesToArrayException() throws CustomArrayException {
        linesToCustomArrayMapper.mapLinesToArray(new ArrayList<>());
    }

    @Test(expectedExceptions = CustomArrayException.class, expectedExceptionsMessageRegExp = "Empty")
    public void testMapLinesToArrayExceptionWrongMessage() throws CustomArrayException {
        linesToCustomArrayMapper.mapLinesToArray(new ArrayList<>());
    }
}