package mirea__lab__11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main_2 {
    public static void main(String[] args) {
        List<Pupil> list1 = new ArrayList<>();
        list1.add(new Pupil("Alice", 3.8));
        list1.add(new Pupil("Bob", 3.5));

        List<Pupil> list2 = new ArrayList<>();
        list2.add(new Pupil("Charlie", 4.0));
        list2.add(new Pupil("David", 3.9));

        List<Pupil> mergedList = new ArrayList<>(list1.size() + list2.size());
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        MergeSort.mergeSort(mergedList, Comparator.comparing(Pupil::getGPA).reversed());

        System.out.println("Отсортированный объединенный список студентов по итоговым баллам в порядке убывания:");
        for (Pupil pupil : mergedList) {
            System.out.println("Имя: " + pupil.getName() + ", GPA: " + pupil.getGPA());
        }
    }
}
