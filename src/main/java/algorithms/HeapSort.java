package algorithms;

import java.util.ArrayList;
import java.util.List;

public class HeapSort {

    private final static Integer LIST_SIZE = 20;
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        ListRandomGenerator.generateNumbersInList(list, LIST_SIZE);
        System.out.println("Lista do sortowania: ");
        System.out.println(list);

        list = doHeapSorting(list);
        System.out.println("Lista posortowana: ");
        System.out.println(list);
    }

    private static List<Integer> doHeapSorting(List<Integer> list) {
        int n = list.size();
        int rootIndex = 0;

        for (int i = n/2 -1; i >= 0; i--) {
            validateHeapMax(list, n, i);
        }
        for (int i = n -1; i>0; i--) {
            SortingUtils.swap(list, rootIndex, i);
            validateHeapMax(list, --n, rootIndex);
        }
        return list;
    }

    private static void validateHeapMax (List<Integer> list, int heapSize, int parentIndex) {
        int maxIndex = parentIndex;
        int leftChild = parentIndex * 2 + 1;
        int rightChild = parentIndex * 2 + 2;

        if(leftChild < heapSize && list.get(leftChild) > list.get(maxIndex)) {
            maxIndex = leftChild;
        }
        if(rightChild < heapSize && list.get(rightChild) > list.get(maxIndex)) {
            maxIndex = rightChild;
        }
        if(maxIndex != parentIndex) {
            SortingUtils.swap(list, maxIndex, parentIndex);
            validateHeapMax(list, heapSize, maxIndex);
        }
    }
}
