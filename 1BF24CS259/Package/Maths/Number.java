import java.util.Scanner;
package Maths;

public class Number {
    int num1,num2;

    public Number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        num2 = sc.nextInt();
    }
    public void add(){
        int sum = num1 + num2;
        System.out.println("Sum : "+sum);
    }
    public void subtract(){
        int diff = num1 - num2;
        System.out.println("Difference : "+diff);
    }
}
