package io.olen4ixxx.taskarray.filereader;

import io.olen4ixxx.taskarray.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ArrayFileReader {
    static Logger logger = LogManager.getLogger();

    public List<String> readLines(String stringPath) throws CustomArrayException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(stringPath);
        if (resource == null) {
            logger.error("File is not found");
            throw new CustomArrayException("File is not found");
        }
        URI uri;
        try {
            uri = resource.toURI();
        } catch (URISyntaxException e) {
            logger.error("Wrong file path");
            throw new CustomArrayException("Wrong file path", e);
        }
        Path path = Path.of(uri);
        List<String> linesFromFile;
        try {
            linesFromFile = Files.readAllLines(path);
        } catch (IOException e) {
            logger.error("Check the file");
            throw new CustomArrayException("Check the file", e);
        }
        logger.info("File is read");
        return linesFromFile;
    }
}
