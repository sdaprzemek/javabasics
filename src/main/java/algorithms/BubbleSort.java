package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSort {
    private final static int MAX_INT_RANDOM = 100;
    private final static int ARRAY_SIZE_TO_GENERATE = 30;

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        generateNumbersInList(array, ARRAY_SIZE_TO_GENERATE);
        System.out.println("Tablica do sortowania: ");
        printArray(array);
        sortBubble(array);
        System.out.println("\nTabilca posortowana: ");
        printArray(array);
    }

    private static void generateNumbersInList(List<Integer> array, int j) {
        Random random = new Random();
        for(int i=0; i<j; i++) {
            array.add(random.nextInt(MAX_INT_RANDOM));
        }
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

        while (counter <= array.size()) {
            for (int i = 0; i < array.size()-1; i++) {
                a = array.get(i);
                b = array.get(i + 1);
                if (a > b) {
                    array.set(i, b);
                    array.set(i + 1, a);
                } else {
                    continue;
                }
            }
            counter++;
        }
    }
}
