package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();
            if(input != ""){
                nameList.add(input);
            }else{
                break;
            }
        }

        System.out.println(nameList.get(2));
    }
}
