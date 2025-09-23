import java.lang.Math;
import java.util.Scanner;

class quadratic {
    public static void main(String args[]){
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        a = in.nextInt();
        System.out.println("Enter value of b : ");
        b = in.nextInt();
        System.out.println("Enter value of c : ");
        c = in.nextInt();
        if (a == 0){
            System.out.println("Not a qudratic equation");
            System.out.println("Enter new value of a : ");
            a = in.nextInt();
        }
        else{
            int d = b*b - 4*a*c;
            if(d == 0){
                int r1 = (-b)/(2*a);
                System.out.print("Roots are real and equal : ");
                System.out.print(r1);
            }
            else if(d>0){
                double r1 = ((-b) + (Math.sqrt(d)))/(double)(2*a);
                double r2 = ((-b) - (Math.sqrt(d)))/(double)(2*a);
                System.out.println("The roots are real and distinct");
                System.out.println(r1);
                System.out.println(r2);
            }
            else if(d<0){
                double realPart = -b / (2.0 * a);
                double imaginaryPart = Math.sqrt(-d) / (2.0 * a);
                System.out.println("Roots are imaginary: ");
                System.out.println(realPart + " + " + imaginaryPart + "i");
                System.out.println(realPart + " - " + imaginaryPart + "i");
            }
        }
    }
        
}

