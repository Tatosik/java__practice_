package mirea__lab__18;
import java.io.Serializable;
public class Main {
    public static void main(String[] args) {
        testMyClass();
        testMinMax();
        testCalculator();
        testMatrix();
    }

    private static void testMyClass() {
        System.out.println("Testing MyClass:");

        Integer integerVal = 10;
        Dog dog = new Dog("Chao-chao", 10);
        String stringVal = "Hello";

        MyClass<Integer, Dog, String> myClass = new MyClass<>(integerVal, dog, stringVal);
        myClass.printClassNames();
    }

    private static void testMinMax() {
        System.out.println("\nTesting MinMax:");

        Integer[] intArray = {4, 1, 9, 7, 3};
        MinMax<Integer> minMaxInt = new MinMax<>(intArray);
        System.out.println("Min: " + minMaxInt.findMin());
        System.out.println("Max: " + minMaxInt.findMax());
    }

    private static void testCalculator() {
        System.out.println("\nTesting Calculator:");

        Integer num1 = 10;
        Integer num2 = 5;

        System.out.println("Sum: " + Calculator.sum(num1, num2));
        System.out.println("Multiply: " + Calculator.multiply(num1, num2));
        System.out.println("Divide: " + Calculator.divide(num1, num2));
        System.out.println("Subtract: " + Calculator.subtract(num1, num2));
    }


        private static void testMatrix() {
            System.out.println("Testing Matrix:");

            Integer[][] matrixData1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            Integer[][] matrixData2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

            Matrix<Integer> matrix1 = new Matrix<>(matrixData1);
            Matrix<Integer> matrix2 = new Matrix<>(matrixData2);

            System.out.println("Matrix 1:");
            System.out.println(matrix1);

            System.out.println("Matrix 2:");
            System.out.println(matrix2);

            Matrix<Integer> sumResult = matrix1.add(matrix2);
            System.out.println("Sum of matrices:");
            System.out.println(sumResult);

            Matrix<Integer> subtractResult = matrix1.subtract(matrix2);
            System.out.println("Subtraction of matrices:");
            System.out.println(subtractResult);

        }

}

class Dog implements Animal, Serializable {
    private String breed;
    private int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public String getSpecies() {
        return "Dog";
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}

