package com.elyashevich.quadratic.service.impl;

import com.elyashevich.quadratic.entity.QuadraticEquation;
import com.elyashevich.quadratic.exception.QuadraticEquationException;
import com.elyashevich.quadratic.service.QuadraticEquationService;
import com.elyashevich.quadratic.validator.Validator;
import com.elyashevich.quadratic.validator.impl.ValidatorImpl;

public class QuadraticEquationServiceImpl implements QuadraticEquationService {

    private final Validator validator = new ValidatorImpl();

    @Override
    public QuadraticEquation create(final double a, final double b, final double c) throws QuadraticEquationException {
        if (!this.validator.isValid(a, b, c)) {
            throw new QuadraticEquationException("All fields must be not null");
        }
        return new QuadraticEquation(a, b, c);
    }

    @Override
    public QuadraticEquation findRoots(QuadraticEquation quadraticEquation) {
        return null;
    }

    @Override
    public double findDiscriminant(QuadraticEquation quadraticEquation) {
        return 0;
    }

    @Override
    public void findExtremum(QuadraticEquation quadraticEquation) {

    }
}
