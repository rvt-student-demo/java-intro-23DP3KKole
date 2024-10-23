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
            if(input != -1){
                nameList.add(input);
            }else if(input == -1){
                break;
            }
        }

        System.out.print("From where? ");
        int fromWhere = Integer.valueOf(scanner.nextLine());
        
        System.out.print("To where? ");
        int toWhere = Integer.valueOf(scanner.nextLine());

        int listLength = nameList.size();

        if (fromWhere <= 0 || toWhere >= listLength-1){
            for (; fromWhere <= toWhere; fromWhere++){
                System.out.println(nameList.get(fromWhere));
            }
        }else{
            System.out.println("You are writing a nonexisting index");
        }
    }
}
