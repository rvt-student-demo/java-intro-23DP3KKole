package lv.rvt;

public class Stars {
    public static void printStars(int number){
        for (int i = 0; i<number; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printSquare(int size){
        for (int i = 0; i < size; i++){
            printStars(size);
        }
    }
    public static void printRectangle(int width, int height){
        for (int i = 0; i < height; i++){
            printStars(width);
        }
    }
    public static void printTriangle(int size){
        for (int i = 0; i < size+1; i++){
            printStars(i);
        }
    }
    public static void printSpaces(int number){
        for (int i  = 0; i < number; i++){
            System.out.print(" ");
        }
    }
    public static void printRightTriangle(int size){
        for (int i = 1; i<size+1; i++){
            printSpaces(size-i);
            printStars(i);
        }
    }
    public static void christmasTree(int height){
        int count = 1;
        int countStars = 1;

        while (count < height+1) {
            printSpaces(height-count);
            printStars(countStars);
            countStars += 2;
            count++;
        }
        for (int i = 0; i < 2; i++){
            printSpaces(2);
            printStars(3);
        }
    }
}