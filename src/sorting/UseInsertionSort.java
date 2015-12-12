package sorting;

/**
 * Created by rrt on 12/12/2015.
 */
public class UseInsertionSort {

    public static void main(String[] args) {
        int [] array = {6,5,8,7,9,3,1,2,4};
        int temp, k;
        for(int c=0; c<array.length; c++){
                temp = array[c];
                for ( k = c-1; k >=0 && temp<array[k]; k--) {
                    array[k + 1] = array[k];
                }   //end of Inner for loop
            array[k+1] = temp;
        }    //end of Outer for loop
        for(int j=0; j<array.length; j++){
            System.out.println(array[j]);
        }
    }
}
