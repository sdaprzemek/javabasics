package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {
    private final static Integer LIST_SIZE = 20;
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        generateNumbersInList(list, LIST_SIZE);
        System.out.println(list);

        list = doQuickSort(list);
        System.out.println(list);
    }

    private static void generateNumbersInList(List<Integer> list, int j) {
        Random random = new Random();
        for (int i = 0; i < j; i++) {
            list.add(random.nextInt(100));
        }
    }

    private static List<Integer> doQuickSort(List<Integer> list) {
        return list;
    }
}
