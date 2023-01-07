/*Create class Account to provide a method called debit that withdraws money
froman Account. Ensure that the debit amount does not exceed the Account’s
balance. If it does, the balance should be left unchanged and the method
should print a message indicating ―Debit amount exceeded account balance.
Modify class AccountTest (intheexample) to test method debit.
*/

import java.util.Scanner; 

 class Bank
{
    private double balance;


    public Bank ( double initialBalance )
    {

        if ( initialBalance > 0.0 )
            balance = initialBalance;
    }
    public void credit( double amount )
    {

        balance = balance + amount;
    }


    public void debit( double debitAmount )
    {


        if (debitAmount > balance)
        {
            debitAmount = 0.0;
            System.out.println( "Debit amount exceeded account balance." );
        }
        balance = balance - debitAmount;
    }
    public double getBalance()
    {
        return balance;
    }

}

public class Account
{

    public static void main(String[] args)
    {
        Bank account1 = new Bank( 50.00 );
        Bank account2 = new Bank (68.56);


        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

        Scanner input = new Scanner ( System.in );
        double withdrawAmount;

        System.out.print( "Enter withdraw amount for account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf( "\ndeducting %.2f from account2 balance\n\n", withdrawAmount );
        account2.debit( withdrawAmount );


        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
    }
}

// Rajib kumar