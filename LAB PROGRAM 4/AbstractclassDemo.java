import java.util.Scanner;
class InputScanner{
    Scanner sc= new Scanner(System.in);
}
abstract class Shape extends InputScanner{
    int dim1, dim2;
    double Area;
     abstract void getinput();
     abstract void printArea();
}
class Rectangle extends Shape{
    void getinput(){
        System.out.println("Enter the dimensions of the Rectangle (length and breadth):");
        dim1=sc.nextInt();
        dim2=sc.nextInt();
     }
     void printArea(){
        Area=(double)dim1*dim2;
        System.out.println("Area of Rectangle: "+ Area);
     }
}
class Triangle extends Shape{
    void getinput(){
        System.out.println("Enter the dimensions of the Triangle (Base and Height):");
        dim1=sc.nextInt();
        dim2=sc.nextInt();
     }
     void printArea(){
        Area=(double)0.5*dim1*dim2;
        System.out.println("Area of Triangle: "+ Area);
     }
}class Circle extends Shape{
    void getinput(){
        System.out.println("Enter the dimensions of the Circle (Radius):");
        dim1=sc.nextInt();
     }
     void printArea(){
        Area=(double)Math.PI*dim1*dim1;
        System.out.println("Area of Circle: "+ Area);
     }
}
public class AbstractclassDemo {
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        r.getinput();
        Triangle t= new Triangle();
        t.getinput();
        Circle c= new Circle();
        c.getinput();

        r.printArea();
        t.printArea();
        c.printArea();



    }

   
}
