class NewThread1 extends Thread{
   
    public void run(){
       
               
        for(int i=1; i<=5; i++){
            System.out.println("BMS College of Engineering "+i);
            try{
               
                Thread.sleep(10000);
            }catch (InterruptedException e) {
                System.out.println("Interrupt!!!");
            }
        }
    }
}
class NewThread2 extends Thread{
   
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("CSE "+i);
            try{
               Thread.sleep(2000);
            } catch (InterruptedException e) {
            System.out.println("Interrupt!!!");
            }
        }
    }
}



public class ThreadProgram1 {
    public static void main (String args[]){
        NewThread1 n1= new NewThread1();
        NewThread2 n2= new NewThread2();
        n1.start();
        n2.start();
    }
}
