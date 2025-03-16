package com.elyashevich.quadratic.service;

import com.elyashevich.quadratic.entity.QuadraticEquation;
import com.elyashevich.quadratic.exception.QuadraticEquationException;

public interface QuadraticEquationService {

    QuadraticEquation create(final double a, final double b, final double c) throws QuadraticEquationException;

    QuadraticEquation findRoots(final QuadraticEquation quadraticEquation);

    double findDiscriminant(final QuadraticEquation quadraticEquation);

    void findExtremum(final QuadraticEquation quadraticEquation);
}
