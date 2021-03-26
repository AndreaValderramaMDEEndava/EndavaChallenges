package algorithms;

import java.util.Scanner;

public class Challenge1 {
    //CHALLENGE 1 - SUM OF TWO NUMBERS
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
         int number1 = 0;

         System.out.println("Please write a number:");
         number1 = reader.nextInt();

         int number2 = 0;
        System.out.println("Please write a number again:");
        number2 = reader.nextInt();

        System.out.println(sumOfTwoNumbers(number1,number2));

    }

    //METHOD
    public static int sumOfTwoNumbers(int number1,int number2){
        int resultOfSum = 0;

        resultOfSum = number1 + number2;
        return resultOfSum;
    }

}
