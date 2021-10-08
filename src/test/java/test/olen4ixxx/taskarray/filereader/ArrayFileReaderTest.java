package test.olen4ixxx.taskarray.filereader;

import io.olen4ixxx.taskarray.exception.CustomArrayException;
import io.olen4ixxx.taskarray.filereader.ArrayFileReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayFileReaderTest {
    ArrayFileReader arrayFileReader;

    @BeforeClass
    public void setUp() {
        arrayFileReader = new ArrayFileReader();
    }

    @Test(timeOut = 100)
    public void testReadLines() throws CustomArrayException {
        arrayFileReader.readLines();
    }
}