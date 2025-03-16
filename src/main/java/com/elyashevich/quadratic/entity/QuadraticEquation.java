package com.elyashevich.quadratic.entity;

import java.util.Objects;

public class QuadraticEquation {

    private Long id;

    private double a;

    private double b;

    private double c;

    public QuadraticEquation() {}

    public QuadraticEquation(Long id, double a, double b, double c) {
        this.id = id;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuadraticEquation that = (QuadraticEquation) obj;
        return Double.compare(that.a, a) == 0 &&
                Double.compare(that.b, b) == 0 &&
                Double.compare(that.c, c) == 0 &&
                (id == null ? that.id == null : id.equals(that.id));
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + Double.hashCode(a);
        result = 31 * result + Double.hashCode(b);
        result = 31 * result + Double.hashCode(c);
        return result;
    }
}
