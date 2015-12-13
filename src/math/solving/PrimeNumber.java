package math.solving;

/**
 * Created by rrt on 12/13/2015.
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int numbersToBeChecked = 1000000;
        int numberOfPrimeSofar = 0;
        boolean isPrime = true;
        for(int i=2; i<=numbersToBeChecked; i++){
             isPrime = true;
             for(int j=2; j<=i/2; j++){
                 if(i % j == 0){
                     j = i;
                     isPrime = false;
                 }
             }
            if(isPrime){
                System.out.println(i);
                numberOfPrimeSofar++;
            }
        }
        System.out.println("Number Of Prime Numbers So Far: " + numberOfPrimeSofar);
    }
}
