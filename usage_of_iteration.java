import java.util.Scanner;
public class usage_of_iteration {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String choice;

        do{
            System.out.print("Enter employee name:");
            String name=sc.nextLine();

            System.out.print("Enter employee number:");
            int empno=sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.print("Enter job title: ");
            String job=sc.nextLine();

            System.out.println("--Employee details---");
            System.out.println("Name: "+name);
            System.out.println("Employee number: "+empno);
            System.out.println("Job title: "+job);

            System.out.print("Do you want to enter another employee? (yes/no): ");
            choice=sc.nextLine();

        }while(choice.equalsIgnoreCase("Yes"));

        System.out.println("Program terminated");

        sc.close();
    }
}
