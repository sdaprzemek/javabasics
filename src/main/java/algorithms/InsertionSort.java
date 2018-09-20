package algorithms;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    private static final Integer LIST_SIZE = 20;
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        ListRandomGenerator.generateNumbersInList(list, LIST_SIZE);
        System.out.println("Lista do sortowania: ");
        System.out.println(list);
        list = doInsertionSorting(list);
        System.out.println("Lista posortowana: ");
        System.out.println(list);
    }

    private static List<Integer> doInsertionSorting(List<Integer> list) {
        int current;
        int otherIndex;

        for(int i = 1; i < list.size(); i++) {
            current = list.get(i);
            otherIndex = i;
            while(otherIndex > 0 && current < list.get(otherIndex-1)) {
                list.set(otherIndex, list.get(otherIndex-1));
                otherIndex--;
            }
            list.set(otherIndex, current);
        }
        return list;
    }

}
