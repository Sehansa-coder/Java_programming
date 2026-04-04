import java.util.Scanner;
// method to calculate mean
public static double calculating_mean_using_methods(double a,double b,double c){
    return (a+b+c)/3;
}

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    while(true){
        System.out.println("Enter the first value (type 'Exit' to quit): ");
        String input1=sc.next();

        if(input1.equalsIgnoreCase("Exit")){
            System.out.println("program terminated.");
            break;
        }

        double num1=Double.parseDouble(input1);

        System.out.println("enter second value:");
        double num2=sc.nextDouble();

        System.out.println("enter third value:");
        double num3=sc.nextDouble();

        double mean=calculating_mean_using_methods(num1, num2, num3);

        System.out.println("Mean value: "+mean);
    }

    sc.close();
}


// sample output:

// Enter the first value (type 'Exit' to quit): 
// 2
// enter second value:
// 2
// enter third value:
// 2
// Mean value: 2.0

// Enter the first value (type 'Exit' to quit): 

