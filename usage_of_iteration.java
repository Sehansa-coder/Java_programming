// Problem:
// It is required to write a program that reads employee information iteratively. (Employee name, emp_no, job title )
// Additionally users are allowed to decide the termination point. 
// This means that the program prompts user for entering employee information. 
// Soon after the input process the input values are displayed for the user. 
// Then ask the user whether he wants to continue or exit. For example, you may ask users to enter ‘Yes’ to continue and ‘No’ to terminate


// import Scanner object to get user input
import java.util.Scanner;
public class usage_of_iteration {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String choice;

        // using do-while looping operation to get new employee details 
        do{
            // get employee name
            System.out.print("Enter employee name:");
            String name=sc.nextLine();

            // get employee number
            System.out.print("Enter employee number:");
            int empno=sc.nextInt();
            sc.nextLine(); // clear buffer

            // get employee Job
            System.out.print("Enter job title: ");
            String job=sc.nextLine();

            // print the details of employee
            System.out.println("--Employee details---");
            System.out.println("Name: "+name);
            System.out.println("Employee number: "+empno);
            System.out.println("Job title: "+job);

            System.out.print("Do you want to enter another employee? (yes/no): ");
            choice=sc.nextLine();

        }while(choice.equalsIgnoreCase("Yes"));

        // program ended
        System.out.println("Program terminated");

        sc.close();
    }
}

// Sample output:

//Enter employee name:Daniel  
// Enter employee number:22
// Enter job title: Software engineer
// --Employee details---
// Name: Daniel
// Employee number: 22
// Job title: Software engineer
// Do you want to enter another employee? (yes/no): yes
// Enter employee name:Reven
// Enter employee number:10
// Enter job title: Graphic Designer
// --Employee details---
// Name: Reven
// Employee number: 10
// Job title: Graphic Designer
// Do you want to enter another employee? (yes/no): no
// Program terminated
