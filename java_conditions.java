// Higher diploma in Information Technology - Year one Java programming
// problem:
// Write a program to get 2 values as command line arguments and find the Minimum of those 2 using if-else.

class java_conditions{
    public static void main(String[] args){
        if(args.length<2){
            System.out.println("Please enter two values");
            return;
        }

        // get user input with command line arguments
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);

        int minimumNumber;

        // find the maximum number using conditional statements
        if(num1<num2){
            minimumNumber=num1;
        }
        else{
            minimumNumber=num2;
        }

        // print the output
        System.out.println("The minimum number is: "+minimumNumber);

    }
}

// sample output:
// The minimum number is: 10
