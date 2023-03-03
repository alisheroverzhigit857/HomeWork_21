import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Length, heigth and width ");
        double length = scanner.nextDouble();
        double heigth = scanner.nextDouble();
        double width = scanner.nextDouble();

        try {
            Paralleliped paralleliped = new Paralleliped(length,heigth,width);
            System.out.println("Area paralellipeda  "+paralleliped.getArea());
            System.out.println("Volume paralellipeda "+paralleliped.getVolume());
        }catch (ParallelipedException a){
            System.out.println(a.getMessage());
        }
        System.out.println("Radius and  heigth ");
        double radius = new Scanner(System.in).nextDouble();
         heigth = new Scanner(System.in).nextDouble();

         try {
             Cylinder cylinder = new Cylinder(radius,heigth);
             System.out.println(cylinder.getArea());
             System.out.println(cylinder.getVolume());
         }catch (CylinderException e){
             System.out.println(e.getMessage());
         }
        }
}