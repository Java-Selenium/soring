package enumexample;

/**
 * Created by rrt on 12/12/2015.
 */
public class Week {

//    Day day;
//    public Week(Day day){
//         this.day = day;
//    }

    public void whichDayIsToday(Day day){

        switch(day){

            case Monday:
                System.out.println("Home work start for the week");
                break;
            case Tuesday:
                System.out.println("Let's do some data structure");
                break;
            case Wednesday:
                System.out.println("Lets use GitHub");
                break;
            case Thursday:
                System.out.println("Lets complete Codelab");
                break;
            case Friday:
                System.out.println("Lets get ready for core java exam");
                break;
            case Saturday:
                System.out.println("Lets prepare for class on Saturday");
                break;
            case Sunday:
                System.out.println("Lets start Selenium");
                break;
            default:
                System.out.println("This is not a valid day of the week, you are out of your mind");




        }
    }
}
