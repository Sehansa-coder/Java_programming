// problem:
// Write a program to ask the user to enter item name, unit price and the 
// quantity. This will generate the total cost and display the details as follows:

// Enter the Item Name:
// Suger
// Enter the Unit Price
// 250
// Enter the Quantity
/// 5
// Total cost will be 1250 rupees. 


// import Scanner input
import java.util.Scanner;
public class find_total_cost {
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        // get user input
        System.out.print("Enter the item name: ");
        String item=s.nextLine();

        System.out.print("Enter the unit price: ");
        float unit_price=s.nextFloat();

        System.out.print("Enter the quantity: ");
        int quantity=s.nextInt();

        // find total price
        float totalCost=quantity*unit_price;

        System.out.print("Total cost will be "+totalCost+" rupees.");

        s.close();


    }
}

// sample output:

// Enter the Item Name: Sugar
// Enter the Unit Price: 250
// Enter the Quantity: 5

// Total cost will be 1250 rupees. 

