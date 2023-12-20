package mirea__lab__18;

import java.util.Arrays;
public class Matrix<T> {
    private T[][] data;

    public Matrix(T[][] data) {
        this.data = data;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition");
        }

        T[][] resultData = newArray(data.length, data[0].length);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                // Тут можно использовать различные операции суммы в зависимости от типа T
                // В данном примере, предполагается, что T - числовой тип
                resultData[i][j] = addValues(data[i][j], other.data[i][j]);
            }
        }

        return new Matrix<>(resultData);
    }

    public Matrix<T> subtract(Matrix<T> other) {
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for subtraction");
        }

        T[][] resultData = newArray(data.length, data[0].length);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                // Тут можно использовать различные операции вычитания в зависимости от типа T
                // В данном примере, предполагается, что T - числовой тип
                resultData[i][j] = subtractValues(data[i][j], other.data[i][j]);
            }
        }

        return new Matrix<>(resultData);
    }

    // Другие операции с матрицами

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (T[] row : data) {
            result.append(Arrays.toString(row)).append("\n");
        }
        return result.toString();
    }

    private T[][] newArray(int rows, int cols) {
        return (T[][]) new Object[rows][cols];
    }

    private T addValues(T a, T b) {
        // В данном примере, предполагается, что T - числовой тип
        return (T) Double.valueOf(((Number) a).doubleValue() + ((Number) b).doubleValue());
    }

    private T subtractValues(T a, T b) {
        // В данном примере, предполагается, что T - числовой тип
        return (T) Double.valueOf(((Number) a).doubleValue() - ((Number) b).doubleValue());
    }
}

