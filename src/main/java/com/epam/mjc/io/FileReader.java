package com.epam.mjc.io;

import java.io.*;
import java.util.logging.Logger;


public class FileReader {
    private final Logger LOGGER = Logger.getLogger(FileReader.class.getName());

    public Profile getDataFromFile(File file) {

        try(BufferedReader ignored = new BufferedReader(new java.io.FileReader(file))) {
            LOGGER.info("check");
        }catch (IOException e) {

            LOGGER.info(e.getMessage());
            throw new MyOwnRuntimeException("My message");
        }
        return new Profile(file);
    }
}
