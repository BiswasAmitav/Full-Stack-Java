package methods.java;

public class MethodOverloading {
    public static void main(String[] args) {

        //simple method is called here.......
        System.out.println("Area of rectangle : " + area(4.5d, 3.5d));
        System.out.println("Area of Square : " + area(5.0d));
        System.out.println("Area of Square : " + area(5.0d));
    }
    public static double area(double length, double width){
        return length*width;
    }

    public static double area(double side){
        return side*side;
    }
    public static int area(int side){
        return side*side;
    }

}
