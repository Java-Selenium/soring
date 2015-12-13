package math.solving;

/**
 * Created by rrt on 12/13/2015.
 */
public class Fibonacci {

    public static void main(String[] args) {
        int limit = 100;
        int next = 1;
        int prev = 0;
        for(int i=1; i<=limit; i++){
            prev = prev + next;
            next = prev - next;
            System.out.println(next);
        }
    }


}
