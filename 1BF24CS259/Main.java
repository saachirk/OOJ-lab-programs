import java.util.Scanner;
interface Bank{
    void calculateInterst();
    void getDetails();
}

class Canara implements Bank{
    String name;
    int age,PAN;
    double balance;

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter age : ");
        age = sc.nextInt();
        System.out.print("Enter PAN no : ");
        PAN = sc.nextInt();
        System.out.print("Enter balance : ");
        balance = sc.nextDouble();
    }

    public void calculateInterst(){
        double interest = (4.5/100) * balance;
        balance = balance + interest;
        System.out.println("Balance : "+balance);
    }
}
class SBI implements Bank{
    String First_name,Last_name;
    int age,Aadhar;
    double balance;

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        First_name = sc.nextLine();
        System.out.print("Enter Last Name : ");
        Last_name = sc.nextLine();
        System.out.print("Enter age : ");
        age = sc.nextInt();
        System.out.print("Enter Aadhar no : ");
        Aadhar = sc.nextInt();
        System.out.print("Enter balance : ");
        balance = sc.nextDouble();
    }

    public void calculateInterst(){
        double interest = (5.25/100) * balance;
        balance = balance + interest;
        System.out.println("Balance : "+balance);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank[] b = new Bank[5];
        for(int i = 0;i<5;i++){
            System.out.print("Enter Bank Name : ");
            String b_name = sc.nextLine();
            if(b_name.equalsIgnoreCase("Canara")){
                b[i] = new Canara();
                System.out.println("----------------------------");
                System.out.println("Enter Details of User "+(i+1));
                b[i].getDetails();
                b[i].calculateInterst();
                System.out.println("----------------------------");
            }
            else if(b_name.equalsIgnoreCase("SBI")){
                b[i] = new SBI();
                System.out.println("----------------------------");
                System.out.println("Enter Details of User "+(i+1));
                b[i].getDetails();
                b[i].calculateInterst();
                System.out.println("----------------------------");
            }
            else{
                System.out.println("Invalid");
            }
        }
        
    }
}
