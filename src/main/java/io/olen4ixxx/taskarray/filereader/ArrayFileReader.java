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

    public List<String> readArray() throws URISyntaxException, IOException {
        URL res = ArrayFileReader.class.getClassLoader().getResource("array.txt");
        File file = Paths.get(res.toURI()).toFile();
        String aPath = file.getPath();
        Path path = Paths.get(aPath);
        List<String> linesFromFile = Files.readAllLines(path);
        return linesFromFile;
    }
}
