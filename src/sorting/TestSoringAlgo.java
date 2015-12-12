package sorting;

import java.util.Random;

/**
 * Created by rrt on 12/12/2015.
 */
public class TestSoringAlgo {

    public static void main(String[] args) {
        int [] array = new int[100000];
        Random random = new Random();
        for(int i=0; i<array.length; i++){
            array[i] = random.nextInt(1000000);
        }
        //int [] array = {6,5,8,7,9,3,1,2,4};

        SortingAlgo sort = new SortingAlgo();
        int [] sortedArrayByInsertion = sort.insertionSort(array);
        //int [] sortedArraBySelection = sort.selectionSort(array);
        //int [] sortedArrayByBubble = sort.bubbleSort(array);

        System.out.println("Insertion sort: ");
        sort.printArray(sortedArrayByInsertion);
        System.out.println("Selection sort: ");
        //sort.printArray(sortedArraBySelection);
        System.out.println("Bubble sort: ");
       // sort.printArray(sortedArrayByBubble);
    }
}
