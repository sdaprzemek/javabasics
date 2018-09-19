package algorithms;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    private static final Integer LIST_SIZE = 20;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        if (LIST_SIZE.equals(0) || LIST_SIZE.equals(null)) {
            System.out.println("Lista jest pusta");
        }
        ListRandomGenerator.generateNumbersInList(list, LIST_SIZE);
        System.out.println(list);

        list = doQuickSort(list, 0, LIST_SIZE - 1);
        System.out.println(list);
    }

    private static List<Integer> doQuickSort(List<Integer> list, int left, int right) {
        if (left >= right) {
            return list;
        }
        int border = partitionListBeforeQuickSort(list, left, right);
        doQuickSort(list, left, border - 1);
        doQuickSort(list, border + 1, right);
        return list;
    }

    private static int partitionListBeforeQuickSort(List<Integer> list, int left, int right) {
        int pivot = setPivot(list, left, right);
        int border = left - 1;
        int i = left;

        while (i < right) {
            if (list.get(i) < pivot) {
                border++;
                if (border != i) {
                    int tmp = list.get(i);
                    list.set(i, list.get(border));
                    list.set(border, tmp);
                }
            }
            i++;
        }
        border++;
        if (border != right) {
            int tmp = list.get(right);
            list.set(right, list.get(border));
            list.set(border, tmp);
        }
        return border;
    }


    //when implementing other solution remember to move pivot value to the right position in the list
    private static int setPivot (List<Integer> list, int left, int right) {
        int mid = left + (right - left) / 2;
        int pivot = list.get(mid);
        list.set(mid, list.get(right));
        list.set(right, pivot);
        return pivot;
    }
}

