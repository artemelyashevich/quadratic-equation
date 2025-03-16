package com.elyashevich.quadratic.parser;

import com.elyashevich.quadratic.entity.QuadraticEquation;
import com.elyashevich.quadratic.validator.Validator;
import com.elyashevich.quadratic.validator.impl.ValidatorImpl;

public class QuadraticEquationParser {

    private final Validator validator = new ValidatorImpl();

    public QuadraticEquation parseToQuadraticEquation(final String line) {
        var parts = line.trim().split("\\s+");
        var a = Double.parseDouble(parts[0]);
        var b = Double.parseDouble(parts[1]);
        var c = Double.parseDouble(parts[2]);
        if (this.validator.isValid(a, b, c)) {
            throw new IllegalArgumentException("Invalid input");
        }
        return new QuadraticEquation(a, b, c);
    }
}
