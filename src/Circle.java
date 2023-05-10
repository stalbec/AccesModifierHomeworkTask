import java.util.Scanner;

public class Circle {
    public static final double PI = 3.14;


    public static void area (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Circle's area:  " + area);
    }
    public static void circumference () {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner1.nextDouble();
        double circumference = Math.PI * 2 * radius;
        System.out.println("Sircumference:  " + circumference);
    }

}
