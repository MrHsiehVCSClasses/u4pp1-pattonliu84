package u4pp;


public class LeapYear {

    public static boolean isLeapYear(int year){
    boolean leap = false;

    if (year > 1582 && year % 4 == 0){
        if (year % 400 == 0){
            leap = true;
        } else if (year % 100 == 0){
            leap = false;
        } else if (year % 4 == 0){
            leap = true;
        }
    }
    return leap;
}

}
       
    
    
    



