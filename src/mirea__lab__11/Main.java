package mirea__lab__11;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.8),
                new Student("Bob", 3.5),
                new Student("Charlie", 4.0),
                // Добавьте своих студентов с итоговыми баллами
        };

        SortingStudentsByGPA.quickSort(students, 0, students.length - 1, new SortingStudentsByGPA());

        System.out.println("Отсортированный массив студентов по итоговым баллам в порядке убывания:");
        for (Student student : students) {
            System.out.println("Имя: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}
