package com.epam.mjc.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public class FileReader {

    public Profile getDataFromFile(File file) {

        try(InputStream inputStream = null) {

        }catch (IOException e) {
            System.err.println("null");
        }
        return new Profile(file);
    }
}
