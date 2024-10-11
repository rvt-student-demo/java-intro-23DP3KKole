package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Stars.printStars(5);
        Stars.printStars(3);
        Stars.printStars(9);

        System.out.println();

        Stars.printSquare(4);

        System.out.println();

        Stars.printRectangle(17, 3);

        System.out.println();

        Stars.printTriangle(4);

        System.out.println();

        Stars.printRightTriangle(4);

        System.out.println();

        Stars.christmasTree(4);
    }
}
