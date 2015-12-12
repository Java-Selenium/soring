package sorting;

/**
 * Created by rrt on 12/12/2015.
 */
public class UseBubbleSort {

    public static void main(String[] args) {
        int [] array = {6,5,8,7,9,3,1,2,4};
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

        for(int j=0; j<array.length; j++){
            System.out.println(array[j]);
        }
    }
}
