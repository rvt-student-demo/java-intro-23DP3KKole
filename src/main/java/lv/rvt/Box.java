package lv.rvt;

public class Box {
    double length, height, width;
    Box(double length, double height, double width){
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double length(){
        return this.length;
    }

    public double height(){
        return this.height;
    }

    public double width(){
        return this.width;
    }

    public Box biggerBox(Box olBox){
        return null;
    }

    private double faceArea(double length, double height){
        return length * height;
    }

    private double topArea(double width, double length){
        return width*length;
    }

    private double sideArea(double height, double width){
        return height * width;
    }

    public double area(){
        return 2 * faceArea(this.length, this.height) + 2 * topArea(this.width, this.length) + 2 * sideArea(this.height, this.width);
    }

    public double volume(double length, double width, double height){
        return length*width*height;
    }
}
