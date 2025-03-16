package com.elyashevich.quadratic.reder;

import com.elyashevich.quadratic.entity.QuadraticEquation;
import com.elyashevich.quadratic.parser.QuadraticEquationParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class QuadraticEquationFileReader {

    private final QuadraticEquationParser parser = new QuadraticEquationParser();

    public List<QuadraticEquation> read(final String pathToEquationsFile) {
        Objects.requireNonNull(pathToEquationsFile, "The path to migrations cannot be null");

        try (var lines = Files.lines(Paths.get(pathToEquationsFile))) {
            return lines
                    .map(this.parser::parseToQuadraticEquation)
                    .toList();
        } catch (IOException e) {
            throw new IllegalArgumentException("Error during parsing quadratic equations file", e);
        }
    }
}
