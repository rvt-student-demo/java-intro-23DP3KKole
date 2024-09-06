package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Print your name");
        String name = myScan.nextLine();

        System.out.println("Print your surname");
        String surname = myScan.nextLine();

        System.out.println("Print group which you are attended to");
        String group = myScan.nextLine();

        System.out.println("Students: " + name + " " + surname + ", grupa " + group);
    }

}
