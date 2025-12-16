import java.util.Scanner;

class WrongAge extends Exception{
    public WrongAge(){
        super("Age Error!");
    }
    public WrongAge(String message){
        super(message);
    }

}
class InputScanner{
    Scanner s = new Scanner(System.in);
}
class Father extends InputScanner{
    protected int FatherAge;
    public Father() throws WrongAge{
        System.out.println("Enter father's Age: ");
        FatherAge=s.nextInt();
        if (FatherAge<0){
            throw new WrongAge("Age cannot be negative!");
        }

    }
    public void display(){
        System.out.println("Father's Age: "+ FatherAge);
    }

}
class Son extends Father{
    protected int SonAge;
    public Son() throws WrongAge{
        super();
        System.out.println("Enter son's age: ");
        SonAge= s.nextInt();
        if(SonAge<0){
            throw new WrongAge("Age cannot be negative!");
        }
        if(SonAge>=FatherAge){
            throw new WrongAge("Son's age cannot be greater than or equal to father's age!!");
        }
     
    }
    public void display(){
        super.display();
        System.out.println("Son's Age: "+ SonAge);
    }
}

public class ageexception {
    public static void main(String args[]){
        try {
            Son son= new Son();
            son.display();
        } catch (WrongAge e) {
            System.out.println("Error: "+ e.getMessage());
        }catch(Exception e){
            System.out.println("Unexpected Error: "+ e.getMessage());
        }
    }
}