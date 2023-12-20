package mirea__lab__10;

import java.util.Scanner;

public class Main_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printOddPositionNumbers(scanner, true);
    }

    public static void printOddPositionNumbers(Scanner scanner, boolean isOddPosition) {
        int num = scanner.nextInt();

        if (num == 0) {
            // Базовый случай: если встречено число 0, завершаем рекурсию
            return;
        }

        if (isOddPosition) {
            // Если это число на нечетной позиции, выводим его
            System.out.println(num);
        }

        // Рекурсивный вызов функции с изменением флага isOddPosition
        printOddPositionNumbers(scanner, !isOddPosition);
    }
}

