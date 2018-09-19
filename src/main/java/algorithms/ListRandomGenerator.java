package algorithms;

import java.util.List;
import java.util.Random;

public class ListRandomGenerator {

    private static final int MAX_INT = 100;

    public static void generateNumbersInList(List<Integer> list, int j) {
        Random random = new Random();
        for (int i = 0; i < j; i++) {
            list.add(random.nextInt(MAX_INT));
        }
    }
}
