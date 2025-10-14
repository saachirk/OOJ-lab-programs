package lab2;
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
                System.out.println("Roots are real and equal : ");
                System.out.println(r1);
            }
            else if(d>0){
                double r1 = ((-b) + (Math.sqrt(d)))/(double)(2*a);
                double r2 = ((-b) - (Math.sqrt(d)))/(double)(2*a);
                System.out.println(r1);
                System.out.println(r2);
            }
            else if(d<0){
                System.out.println("Roots are imaginary");
                int r1 = (-b)/(2*a);
                double r2 = Math.sqrt(-d)/(2*a);
                System.out.println(r1);
                System.out.println(r2);
            }
        }
    }
        
}

