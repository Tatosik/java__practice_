package mirea__lab__18;

import java.util.Arrays;

class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        return Arrays.stream(array).min(Comparable::compareTo).orElse(null);
    }

    public T findMax() {
        return Arrays.stream(array).max(Comparable::compareTo).orElse(null);
    }
}

