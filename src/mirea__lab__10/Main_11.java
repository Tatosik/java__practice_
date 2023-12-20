package mirea__lab__10;

import java.util.Scanner;

public class Main_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = countOnes(scanner, 0);
        System.out.println("Число 1 встречается " + count + " раз.");
    }

    public static int countOnes(Scanner scanner, int onesCount) {
        int num = scanner.nextInt();

        if (num == 0) {
            // Если встречен ноль
            int nextNum = scanner.nextInt();
            if (nextNum == 0) {
                // Если следом идет еще один ноль, завершаем рекурсию
                return onesCount;
            } else {
                // Иначе продолжаем поиск числа 1
                return countOnes(scanner, onesCount);
            }
        } else if (num == 1) {
            // Если встречено число 1, увеличиваем счетчик и рекурсивно вызываем функцию
            return countOnes(scanner, onesCount + 1);
        } else {
            // Если встречено другое число, просто рекурсивно вызываем функцию
            return countOnes(scanner, onesCount);
        }
    }
}

