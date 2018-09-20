package algorithms;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    private final static int ARRAY_SIZE_TO_GENERATE = 40;

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        ListRandomGenerator.generateNumbersInList(array, ARRAY_SIZE_TO_GENERATE);
        System.out.println("Tablica do sortowania: ");
        printArray(array);
        sortBubble(array);
        System.out.println("\nTabilca posortowana: ");
        printArray(array);
    }

    private static void printArray(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(" " + array.get(i));
        }
    }

    private static void sortBubble(List<Integer> array) {
        int a;
        int b;
        int counter = 1;
        boolean swapped = true;

        while (counter <= array.size() - 1 - counter && swapped) {
            swapped = false;
            for (int i = 0; i < array.size()-1; i++) {
                a = array.get(i);
                b = array.get(i + 1);
                if (a > b) {
                    array.set(i, b);
                    array.set(i + 1, a);
                    swapped = true;
                } else {
                    continue;
                }
            }
            counter++;
        }
    }
}
