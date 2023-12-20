package mirea__lab__11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeSort {
    public static void mergeSort(List<Pupil> pupils, Comparator<Pupil> comparator) {
        int size = pupils.size();
        if (size < 2) {
            return;
        }

        int mid = size / 2;
        List<Pupil> left = new ArrayList<>(pupils.subList(0, mid));
        List<Pupil> right = new ArrayList<>(pupils.subList(mid, size));

        mergeSort(left, comparator);
        mergeSort(right, comparator);

        merge(pupils, left, right, comparator);
    }

    private static void merge(List<Pupil> pupils, List<Pupil> left, List<Pupil> right, Comparator<Pupil> comparator) {
        int leftSize = left.size();
        int rightSize = right.size();
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (comparator.compare(left.get(i), right.get(j)) > 0) {
                pupils.set(k++, left.get(i++));
            } else {
                pupils.set(k++, right.get(j++));
            }
        }

        while (i < leftSize) {
            pupils.set(k++, left.get(i++));
        }

        while (j < rightSize) {
            pupils.set(k++, right.get(j++));
        }
    }
}
