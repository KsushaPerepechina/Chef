package com.epam.chef.reader;

import com.epam.chef.exception.InaccessibleFileException;
import com.epam.chef.validation.TxtFilePathValidator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextReader {
    private static final Logger log = LogManager.getLogger(TextReader.class);

    public List<String> readAllLines(final String filePath) throws InaccessibleFileException {
        List<String> textContent = null;
        TxtFilePathValidator txtFilePathValidator = new TxtFilePathValidator();
        if(!txtFilePathValidator.isCorrect(filePath)) {
            throw new InaccessibleFileException("File path <" + filePath + "> is incorrect.");
        }
        if(Files.notExists(Paths.get(filePath))) {
            throw new InaccessibleFileException("File <" + filePath + "> does not exist.");
        }
        if(!Files.isReadable(Paths.get(filePath))) {
            throw new InaccessibleFileException("Reading of file <" + filePath + "> is not allowed.");
        }
        try {
            textContent = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        return textContent;
    }
}