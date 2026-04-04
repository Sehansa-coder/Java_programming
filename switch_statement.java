// Higher diploma in Information Technology - Year one Java programming.
// problem:
// Write a program that will read a Student’s mark (0-100) as a keyboard input and reports 
// what grade is obtained. Use Switch statement.

// 80-100  "Distinction"
// 60-79   "Honors"
// 50-59   "Merit"
// 40-49   "Pass"
// 0-39    "Fail"
// Any other value   "Invalid value entered"



// import Scanner
import java.util.Scanner;
public class switch_statement {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        // get user input
        System.out.print("Enter the mark (0-100): ");
        int mark=s.nextInt();

        // using switch statements
        switch(mark/10){
            case 10:
            case 9:
            case 8:
                System.out.println("Distinction");
                break;
            case 7:
            case 6:
                System.out.println("Honors");
                break;
            case 5:
                System.out.println("Merit");
                break;
            case 4:
                System.out.println("Pass");
                break;
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid value entered");
            
        }

        s.close();

    }
}


// sample output:
// Enter the mark (0-100): 100
// Distinction
