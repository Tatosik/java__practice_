package mirea__lab__13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileManipulationWithMenu {
    public static void main(String[] args) {
        Scanner menuScanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nМеню:");
            System.out.println("1. Записать в файл");
            System.out.println("2. Вывести информацию из файла");
            System.out.println("3. Заменить информацию в файле");
            System.out.println("4. Добавить текст в конец файла");
            System.out.println("0. Выйти");

            System.out.print("Выберите действие (введите номер): ");
            choice = menuScanner.nextInt();
            menuScanner.nextLine(); // Чтение символа новой строки

            switch (choice) {
                case 1:
                    writeToFile();
                    break;
                case 2:
                    readFromFile();
                    break;
                case 3:
                    replaceInFile();
                    break;
                case 4:
                    appendToFile();
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Повторите попытку.");
            }
        } while (choice != 0);
    }

    private static void writeToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("example.txt"))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите информацию для записи в файл:");
            String input = scanner.nextLine();
            writer.println(input);
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    private static void readFromFile() {
        try (Scanner scanner = new Scanner(new File("example.txt"))) {
            System.out.println("\nИнформация из файла:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }

    private static void replaceInFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("example.txt"));
             Scanner scanner = new Scanner(new File("example.txt"))) {

            System.out.println("\nВведите новую информацию для замены в файле:");
            String replacement = new Scanner(System.in).nextLine();
            writer.println(replacement);

            System.out.println("Информация успешно заменена в файле.");
        } catch (IOException e) {
            System.err.println("Ошибка при замене информации в файле: " + e.getMessage());
        }
    }

    private static void appendToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("example.txt", true))) {
            System.out.println("\nВведите текст для добавления в конец файла:");
            String additionalText = new Scanner(System.in).nextLine();
            writer.println(additionalText);

            System.out.println("Текст успешно добавлен в конец файла.");
        } catch (IOException e) {
            System.err.println("Ошибка при добавлении текста в конец файла: " + e.getMessage());
        }
    }
}
