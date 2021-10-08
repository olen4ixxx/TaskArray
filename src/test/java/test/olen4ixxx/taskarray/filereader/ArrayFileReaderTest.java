package test.olen4ixxx.taskarray.filereader;

import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.filereader.ArrayFileReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class ArrayFileReaderTest {
    ArrayFileReader arrayFileReader;

    @BeforeClass
    public void setUp() {
        arrayFileReader = new ArrayFileReader();
    }

    @Test(timeOut = 100)
    public void testReadLinesTimeOut() throws CustomArrayException {
        arrayFileReader.readLines("data/arrayTestBig.txt");
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testReadLinesException() throws CustomArrayException {
        arrayFileReader.readLines("data/wrongName.txt");
    }

    @Test
    public void testReadLines() throws CustomArrayException {
        String[] array = {"1", "rr", "", "2.0"};
        List<String> expected = Arrays.asList(array);
        List<String> actual = arrayFileReader.readLines("data/linesTest.txt");
        assertEquals(actual, expected);
    }
}