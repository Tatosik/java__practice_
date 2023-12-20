package mirea__lab__3;
import java.util.Scanner;
import java.util.Random;


public class Arr__Sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){ //Заполнение маасива
            arr[i] = sc.nextInt();
        }

        //Сумма элементов массива через for
        int sum_for = 0;
        for (int i = 0; i < n; i++){ //Заполнение маасива
            sum_for = sum_for + arr[i];
        }
        System.out.println("Сумма массива через цикл for = " + sum_for);

        //Сумма элементов массива через while
        int sum_while = 0;
        int k = 0;
        while(k < n){
            sum_while = sum_while + arr[k];
            k++;
        }
        System.out.println("Сумма массива через цикл while = " + sum_while);

        //Сумма элементов массива через do while
        int sum_do_while = 0;
        int j = 0;
        do{
            sum_do_while = sum_do_while + arr[j];
            j++;
        }while(j < n);
        System.out.println("Сумма массива через цикл do while = " + sum_do_while);


        // Вывод на экран аргументов командной строки в цикле for
        System.out.println("Вывод на экран аргументов командной строки в цикле for: ");
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);

        //Вывод на экран первых 10 чисел гармонического ряда
        int garmoni_sum = 0;
        System.out.println("Гармонический ряд: ");
        for (double i = 1; i <= 10; i++){
            double a = 1.0 / i;
            System.out.println(a);
        }



        //Сортировка рандомного массива
        Random rnd = new Random();
        int[] numbers = new int[11];
        for(int i = 0;i < numbers.length; i++) { //заполнение массива случайными числами
            numbers[i] = rnd.nextInt(20);
        }
        for (int i = numbers.length - 1; i > 0; i--) { //сортировка
            for (int g = 0; g < i; g++) {
                if (numbers[g] > numbers[g + 1]) {
                    int tmp = numbers[g];
                    numbers[g] = numbers[g + 1];
                    numbers[g + 1] = tmp;
                }
            }
        }
        for(int i = 0;i < numbers.length; i++) { //вывод сортрованного массива
            System.out.print(numbers[i] + " ");
        }


        //Проверка метода
        System.out.println("\nВведите число, факториал которого нужно посчитать: ");
        int f = sc.nextInt();
        f = getFactorial(f);
        System.out.println(f);
    }

    //Метода вычисляющий факториал числа
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
