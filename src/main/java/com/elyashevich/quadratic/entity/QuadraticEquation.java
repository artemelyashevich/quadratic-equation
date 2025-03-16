package com.elyashevich.quadratic.entity;


public class QuadraticEquation {

    private double a;

    private double b;

    private double c;

    public QuadraticEquation() {}

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
                Double.compare(that.c, c) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + Double.hashCode(a);

        result = 31 * result + Double.hashCode(b);

        result = 31 * result + Double.hashCode(c);

        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuadraticEquation{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", c=").append(c);
        sb.append('}');
        return sb.toString();
    }
}
