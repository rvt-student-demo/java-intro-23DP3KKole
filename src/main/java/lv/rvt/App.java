package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nameList = new ArrayList<>();

        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input != 0){
                nameList.add(input);
            }else if(input == 0){
                nameList.add(input);
                break;
            }
        }

        System.out.println(nameList.get(1)+nameList.get(2));
    }
}
