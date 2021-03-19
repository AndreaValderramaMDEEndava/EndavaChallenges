package algorithms;

public class Challenge2 {
    public static void main(String[] args) {

        int yearTested = centuryOfYear(1800);
        System.out.println(yearTested);

    }

    //CHALLENGE 2 - CENTURY OF YEAR
    public static int centuryOfYear(int year){
        if (year % 100 == 0) {
            year = year / 100;
        } else {
            year = (year / 100) + 1;
        }
        return year;
    }


}
