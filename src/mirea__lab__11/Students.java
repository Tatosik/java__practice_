package mirea__lab__11;

public class Students implements Comparable<Students> {
    private int iDNumber;
    private String name;

    public Students(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Students other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    public static void insertionSort(Students[] students) {
        int n = students.length;

        for (int i = 1; i < n; ++i) {
            Students key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        // Создаем массив студентов
        Students[] students = {
                new Students(3, "Alice"),
                new Students(1, "Bob"),
                new Students(2, "Charlie"),
                // Добавьте свои студенты по мере необходимости
        };

        // Сортируем массив студентов по iDNumber сортировкой вставками
        insertionSort(students);

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив студентов по iDNumber:");
        for (Students student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Имя: " + student.getName());
        }
    }
}

