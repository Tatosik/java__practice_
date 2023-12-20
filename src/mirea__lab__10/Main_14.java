package mirea__lab__10;

public class Main_14 {
    public static void main(String[] args) {
        int N = 675360;
        printDigits(N);
    }

    public static void printDigits(int N) {
        if (N < 10) {
            // Базовый случай: если число меньше 10, это последняя цифра, выводим её
            System.out.print(N + " ");
        } else {
            // Рекурсивный случай: разбиваем число на две части - последнюю цифру и оставшееся число
            int lastDigit = N % 10;
            int remainingDigits = N / 10;

            // Рекурсивный вызов для оставшихся цифр
            printDigits(remainingDigits);

            // Выводим последнюю цифру
            System.out.print(lastDigit + " ");
        }
    }
}

