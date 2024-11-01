package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int count = 0;
        int sum = 0;
        String userInput = "";
        Scanner scanner = new Scanner(System.in);

        while(true){
            userInput = scanner.nextLine();

            String[] splitArr = userInput.split(",");
            sum = sum + Integer.valueOf(splitArr[1]);
            count++;

            if (userInput == ""){
                String longest = "";
                for (int i = 0; i < count; i++){
                    if (splitArr[i].length() < longest.length()){
                        longest = splitArr[i];
                    }
                }
                System.out.println("Longest name: " + longest);
                break;
            }
        }

        if (sum > 0){
            System.out.println("Average of the birth years: " + (1.0* sum / count));
        } else {
            System.out.println("Something went wrong...");
        }
    }
}
