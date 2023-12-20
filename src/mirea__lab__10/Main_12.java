package mirea__lab__10;

import java.util.Scanner;

public class Main_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printOddNumbers(scanner);
    }

    public static void printOddNumbers(Scanner scanner) {
        int num = scanner.nextInt();

        if (num == 0) {
            // Базовый случай: если встречено число 0, завершаем рекурсию
            return;
        }

        if (num % 2 != 0) {
            // Если число нечетное, выводим его
            System.out.println(num);
        }

        // Рекурсивный вызов функции
        printOddNumbers(scanner);
    }
}

