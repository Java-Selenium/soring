package sorting;

import java.util.Random;

/**
 * Created by rrt on 12/12/2015.
 */
public class TestSoringAlgo {

    public static void main(String[] args) {
        int [] array = new int[1000000];
        Random random = new Random();
        for(int i=0; i<array.length; i++){
            array[i] = random.nextInt(1000000);
        }
        final long stratTime = System.currentTimeMillis();
        //int [] array = {6,5,8,7,9,3,1,2,4};

        SortingAlgo sort = new SortingAlgo();
       // int [] sortedArrayByInsertion = sort.insertionSort(array);
        int [] sortedArraBySelection = sort.selectionSort(array);
        //int [] sortedArrayByBubble = sort.bubbleSort(array);
       // int [] sortedArrayByMerge = sort.mergeSort(array);

//        System.out.println("Insertion sort: ");
//        sort.printArray(sortedArrayByInsertion);
        System.out.println("Selection sort: ");
        sort.printArray(sortedArraBySelection);
//        System.out.println("Bubble sort: ");
       // sort.printArray(sortedArrayByBubble);
        //System.out.println("Merge sort: ");
        //sort.printArray(sortedArrayByMerge);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - stratTime;
        System.out.println("Total Execution time: " + executionTime);
    }
}
