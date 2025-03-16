package com.elyashevich.quadratic.validator.impl;

import com.elyashevich.quadratic.validator.Validator;

public class ValidatorImpl implements Validator {

    @Override
    public boolean isValid(final double a, final double b, final double c) {
        return a != 0 && b != 0 && c != 0;
    }
}
