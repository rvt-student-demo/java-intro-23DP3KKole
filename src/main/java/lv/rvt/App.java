package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int sum = 0;
        System.out.println("Last number?");
        Scanner scanner = new Scanner(System.in);

        int userInput = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= userInput; i++){
            sum = sum + i;
        }
        
        System.out.println("The sum is: ");
        System.out.println(sum);
    }

}
