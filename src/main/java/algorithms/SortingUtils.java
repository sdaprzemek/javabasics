package algorithms;

import java.util.List;

public class SortingUtils {

    public static void swap(List<Integer> list, int index1, int index2) {
        int tmp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, tmp);
    }
}
