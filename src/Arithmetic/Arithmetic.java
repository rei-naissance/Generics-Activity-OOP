package Arithmetic;

import java.util.InputMismatchException;

public class Arithmetic<N extends Number> {
    private N num1;
    private N num2;

    public Arithmetic(N num1, N num2) {
        if(num1 instanceof Number && num2 instanceof Number) {
            this.num1 = num1;
            this.num2 = num2;
        } else {
            throw new InputMismatchException("Input is invalid.");
        }
    }

    public double add(N num1, N num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract(N num1, N num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply(N num1, N num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide(N num1, N num2) {
        if (num2.intValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            return num1.doubleValue() / num2.doubleValue();
        }
    }

    public double getMin(N num1, N num2) {
        return Math.min(num1.doubleValue(), num2.doubleValue());
    }

    public double getMax(N num1, N num2) {
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}
