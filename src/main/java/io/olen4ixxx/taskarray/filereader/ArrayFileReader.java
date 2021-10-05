package io.olen4ixxx.taskarray.filereader;

import io.olen4ixxx.taskarray.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ArrayFileReader {
    static Logger logger = LogManager.getLogger();

    public List<String> readArray() throws ClassCastException {
        URL res = ArrayFileReader.class.getClassLoader().getResource("array.txt");
        File file = null;
        try {
            file = Paths.get(res.toURI()).toFile();
        } catch (URISyntaxException e) {
            throw new ClassCastException("Wrong file path");
        }
        String aPath = file.getPath();
        Path path = Paths.get(aPath);
        List<String> linesFromFile = null;
        try {
            linesFromFile = Files.readAllLines(path);
        } catch (IOException e) {
            throw new ClassCastException("Check the file");
        }
        return linesFromFile;
    }
}
