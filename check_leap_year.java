// Higher Diploma in Information Technology - Year 1 Java Programming
// problem:
// Write program that takes a year between 1800 and 3000 as a keyboard input and then reports 
// whether it is a leap year. A leap year is an integer greater than 1584 that is either divisible by 400 OR 
// is divisible by 4 but not 100. 


// import java Scanner
import java.util.Scanner;
public class check_leap_year {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        // get user input
        System.out.print("Enter a year: ");
        int year=input.nextInt();

        // check whether the input year is within the range
        if(year>=1800 && year<=3000){
            if(year%400==0 || year%4==0 && year%100!=0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
        else{
            System.out.println("Invalid year");
        }

        input.close();
    }
}

// sample output:

// Enter a year: 2022
// Not a leap year

// Enter a year: 1600
// Invalid year

// Enter a year: 2028
// Leap year
