package lv.rvt;

import java.io.BufferedReader;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        //BufferedReader reader = Helper.getReader("persons.csv");

        Account matthewAccount = new Account("Matthew", 1000.0);
        Account myAccount = new Account("Me", 0.0);

        matthewAccount.withdraw(100.0);
        myAccount.deposit(100.0);

        System.out.println(matthewAccount.toString());
        System.out.println(myAccount.toString());

        matthewAccount.printAccount();
        myAccount.printAccount();
    }
}
