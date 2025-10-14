import java.util.Scanner;

class student{
    String usn;
    String name;
    int n;
    int credits[];
    int marks[];

    void acceptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter USN : ");
        usn = sc.nextLine();
        System.out.print("Enter Name  : ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects : ");
        n = sc.nextInt();

        credits = new int[n];
        marks = new int[n];

        for(int i=0 ; i<n;i++){
            System.out.print("Enter the credits for subject" + (i+1) +": ");
            credits[i] = sc.nextInt();
            System.out.print("Enter the marks for subject" +(i+1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    double CalculateSGPA(){
        double TotalCredits = 0;
        double TotalPoints = 0;
        for(int i = 0;i<n;i++){
            int gradepoints;
            if(marks[i] >= 90){
                gradepoints = 10;
            }
            else if(marks[i] >= 80){
                gradepoints = 9;
            }
            else if(marks[i] >= 70){
                gradepoints = 8;
            }
            else if(marks[i] >= 60){
                gradepoints = 7;
            }
            else if(marks[i] >= 50){
                gradepoints = 6;
            }
            else if(marks[i] >= 40){
                gradepoints = 5;
            }
            else{
                gradepoints = 0;
            }

            TotalPoints += gradepoints * credits[i];
            TotalCredits += credits[i];
        }
        return TotalPoints/TotalCredits;
    }
    void displayDetails(int studentNumber){
        System.out.println("\n--- Student Details ---");
        System.out.println("USN  : " + usn);
        System.out.println("Name : " + name);
        System.out.println("\nSubject-wise details of student");
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + ": Marks = " + marks[i] + ", Credits = " + credits[i]);
        }
            
        System.out.printf("\nSGPA: %.2f\n", CalculateSGPA());
    }

}



public class SGPA {
    public static void main(String args[]){
        student s = new student();
        int totalStudents = 2;
        student[] students = new student[totalStudents];

        for (int i = 0; i < totalStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            students[i] = new student();
            students[i].acceptDetails();
        }

        for (int i = 0; i < totalStudents; i++) {
            students[i].displayDetails(i + 1);
        }
        
        
    }
}
