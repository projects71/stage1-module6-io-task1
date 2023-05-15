package com.epam.mjc.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;


public class FileReader {
    private final Logger LOGGER = Logger.getLogger(FileReader.class.getName());

    public Profile getDataFromFile(File file) {

        try(InputStream inputStream = null) {

        }catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
        return new Profile(file);
    }
}
