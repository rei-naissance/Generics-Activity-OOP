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

    public Number add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public Number subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public Number multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public Number divide() {
        if (num2.intValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            return num1.doubleValue() / num2.doubleValue();
        }
    }

    public Number getMin() {
        return Math.min(num1.doubleValue(), num2.doubleValue());
    }

    public Number getMax() {
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}
