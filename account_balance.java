import java.util.Scanner;
public class account_balance {
    public static double calculateBalance(double balance){
        if(balance>50000){
            balance=balance+(balance*0.08);
        }
        else if(balance>25000){
            balance=balance+(balance*0.05);
        }
        else if(balance>10000){
            balance=balance+(balance*0.02);
        }

        return balance;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter account balance: ");
        double balance=sc.nextDouble();

        double updatedBalance=calculateBalance(balance);

        System.out.print("Updated balance: "+updatedBalance);

        sc.close();
    }
    
}

