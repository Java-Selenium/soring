package sorting;

/**
 * Created by rrt on 12/12/2015.
 */
public class SortingAlgo {

    public  int [] insertionSort(int [] array){
        int temp, k;
        for(int c=0; c<array.length; c++){
            temp = array[c];
            for ( k = c-1; k >=0 && temp<array[k]; k--) {
                array[k + 1] = array[k];
            }   //end of Inner for loop
            array[k+1] = temp;
        }    //end of Outer for loop
        return array;

    }
    public  int [] selectionSort(int [] array) {
        int temp, value,i,k;
        for(i=array.length-1; i>0; i--){
            value = 0;
            for(k = 1; k<=i; k++){
                if(array[k]>array[value])
                    value = k;
            }
            temp = array[value];
            array[value] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public  int [] bubbleSort(int [] array) {
        int temp;
        for(int i=0; i<array.length-1; i++){
            for(int j=1;j<array.length-i; j++){
                if(array[j-1]>array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;

                }  //end of if
            }   //end of Inner for loop
        }    //end of Outer for loop
        return array;
    }
    //implement merge Sort
    public int [] mergeSort(int[] array) {
        int [] list = array;
        divideNumbers(list);
        return list;
    }
    public void divideNumbers(int[] array) {
        int [] list = array;
        if(list.length>1){
            int [] left = lowerBoundry(array);
            int [] right = upperBoundry(array);
            divideNumbers(left);
            divideNumbers(right);
            merge(array,left,right);
        }
    }
    //helper methods
    public int [] lowerBoundry(int [] array){
        int size = array.length/2;
        int [] left = new int[size];
        for(int i=0; i<left.length; i++){
            left[i] = array[i];
         }

        return left;
    }
    public int [] upperBoundry(int [] array){
        int size = array.length - array.length/2;
        int [] right = new int[size];
        for(int i=0; i<right.length; i++){
            right[i] = array[array.length/2+i];
        }
        return right;
    }
    public void merge(int [] result, int [] left, int [] right){
        int index1 = 0;
        int index2 =0;
        for(int i=0; i<result.length; i++){
            if(index2>=right.length|| (index1<left.length&&left[index1] <= right[index2])){
                result[i] = left[index1];
                index1++;
            }  else{
                result[i] = right[index2];
                index2++;
            }
        }

    }

    //implement merge Sort
    public int [] shellSort(int[] array) {

        return array;
    }
    //implement merge Sort
    public int [] quickSort(int[] array) {

        return array;
    }
    //implement merge Sort
    public int [] heapSort(int[] array) {

        return array;
    }
    public void printArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

}
