package mirea__lab__19;
import java.util.Arrays;
import java.util.List;
import java.util.List;
import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {
        testArrayConverter();
        testGenericArrayContainer();
        testCopyAndPrintFirstFive();
        testArrayElementGetter();
    }

    private static void testArrayConverter() {
        System.out.println("Testing ArrayConverter:");

        String[] stringArray = {"apple", "orange", "banana"};
        List<String> stringList = ArrayConverter.arrayToList(stringArray);
        System.out.println("String List: " + stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = ArrayConverter.arrayToList(intArray);
        System.out.println("Integer List: " + intList);

        System.out.println();
    }

    private static void testArrayElementGetter() {
        System.out.println("Testing ArrayElementGetter:");

        String[] stringArray = {"apple", "orange", "banana"};
        System.out.println("Element at index 1: " + ArrayElementGetter.getElementAtIndex(stringArray, 1));

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Element at index 3: " + ArrayElementGetter.getElementAtIndex(intArray, 3));

        System.out.println();
    }

    private static void testGenericArrayContainer() {
        System.out.println("Testing GenericArrayContainer:");

        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArrayContainer<Integer> intContainer = new GenericArrayContainer<>(intArray);
        System.out.println("Integer Array: " + Arrays.toString(intContainer.getArray()));

        String[] stringArray = {"apple", "orange", "banana"};
        GenericArrayContainer<String> stringContainer = new GenericArrayContainer<>(stringArray);
        System.out.println("String Array: " + Arrays.toString(stringContainer.getArray()));

        System.out.println();
    }

    private static void testCopyAndPrintFirstFive() {
        System.out.println("Testing copyAndPrintFirstFive:");

        List<String> inputList = new ArrayList<>();
        inputList.add("Item 1");
        inputList.add("Item 2");
        inputList.add("Item 3");
        inputList.add("Item 4");
        inputList.add("Item 5");
        inputList.add("Item 6");

        List<String> result = ListManipulation.copyAndPrintFirstFive(inputList);

        System.out.println("Result List:");
        for (String element : result) {
            System.out.println(element);
        }

        System.out.println();
    }
}

