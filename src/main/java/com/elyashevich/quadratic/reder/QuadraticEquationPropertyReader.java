package com.elyashevich.quadratic.reder;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class QuadraticEquationPropertyReader {

    public static String loadProperty(String fileName) {
        try {
            var resource = ResourceBundle.getBundle(fileName);
            return resource.getString("quadraticEquation.file.path");
        } catch (MissingResourceException e) {
            throw new IllegalArgumentException("Could not load property file: " + fileName);
        }
    }
}
