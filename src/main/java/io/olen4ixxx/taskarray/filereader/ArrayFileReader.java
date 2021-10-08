package io.olen4ixxx.taskarray.filereader;

import io.olen4ixxx.taskarray.exception.CustomArrayException;
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

    public List<String> readLines() throws CustomArrayException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource("data/array.txt");
        File file;
        try {
            file = Paths.get(resource.toURI()).toFile();
        } catch (NullPointerException e) {
            throw new CustomArrayException("File is not found", e);
        } catch (URISyntaxException e) {
            throw new CustomArrayException("Wrong file path", e);
        }
        String filePath = file.getPath();
        Path path = Paths.get(filePath);

        List<String> linesFromFile;
        try {
            linesFromFile = Files.readAllLines(path);
        } catch (IOException e) {
            throw new CustomArrayException("Check the file", e);
        }
        return linesFromFile;
    }
}
