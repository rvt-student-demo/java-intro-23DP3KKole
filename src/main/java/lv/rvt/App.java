package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Enter a number: 10");
        Scanner scanner = new Scanner(System.in);

        int userVar = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < userVar+1; i++){
            System.out.println(i);
        }
    }

}
