package mirea__lab__18;

public class Calculator {
    public static <T extends Number> T sum(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    }

    public static <T extends Number> T multiply(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
    }

    public static <T extends Number> T divide(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
    }

    public static <T extends Number> T subtract(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
    }
}

