package mirea__lab__19;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class GenericArrayContainer<T> {
    private T[] array;

    public GenericArrayContainer(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArrayContainer<Integer> intContainer = new GenericArrayContainer<>(intArray);
        System.out.println("Integer Array: " + Arrays.toString(intContainer.getArray()));

        String[] stringArray = {"apple", "orange", "banana"};
        GenericArrayContainer<String> stringContainer = new GenericArrayContainer<>(stringArray);
        System.out.println("String Array: " + Arrays.toString(stringContainer.getArray()));
    }
}

