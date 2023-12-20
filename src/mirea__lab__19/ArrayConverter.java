package mirea__lab__19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConverter {
    public static <T> List<T> arrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        String[] stringArray = {"apple", "orange", "banana"};
        List<String> stringList = arrayToList(stringArray);
        System.out.println("String List: " + stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = arrayToList(intArray);
        System.out.println("Integer List: " + intList);
    }
}

