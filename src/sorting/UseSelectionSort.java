package sorting;

/**
 * Created by rrt on 12/12/2015.
 */
public class UseSelectionSort {

    public static void main(String[] args) {

        int [] array = {6,5,8,7,9,3,1,2,4,90,43,56,78,90,22,123,145,0};
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

        for(int j=0; j<array.length; j++){
            System.out.println(array[j]);
        }
    }
}
