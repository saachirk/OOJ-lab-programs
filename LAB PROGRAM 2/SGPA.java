import java.util.Scanner;


class Subject {
    int subjectMarks;
    int credits;
    int grade;
}

class Student {
    String name;
    String usn;
    double SGPA;
    Scanner s = new Scanner(System.in);
    Subject subject[];

   
    Student() {
        subject = new Subject[8]; 
        for (int i = 0; i < 8; i++) {
            subject[i] = new Subject();
        }
    }

   
    void getStudentDetails() {
        System.out.print("Enter student name: ");
        name = s.nextLine();
        System.out.print("Enter USN: ");
        usn = s.nextLine();
    }

   
    void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.println("\nEnter details for Subject " + (i + 1) + ":");
            System.out.print("Marks: ");
            subject[i].subjectMarks = s.nextInt();
            System.out.print("Credits: ");
            subject[i].credits = s.nextInt();

            
            if (subject[i].subjectMarks > 100 || subject[i].subjectMarks < 0) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--;
                continue;
            }

            subject[i].grade = (subject[i].subjectMarks / 10) + 1;

            if (subject[i].grade == 11)
                subject[i].grade = 10;
            if (subject[i].grade <= 4)
                subject[i].grade = 0;
        }
    }

    
    void computeSGPA() {
        int effectiveScore = 0, totalCredits = 0;

        for (int i = 0; i < 8; i++) {
            effectiveScore += (subject[i].grade * subject[i].credits);
            totalCredits += subject[i].credits;
        }

        SGPA = (double) effectiveScore / totalCredits;
    }

    
    void displayDetails() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.printf("SGPA: %.2f\n", SGPA);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student students[] = new Student[2]; 

        for (int i = 0; i < 2; i++) {
            System.out.println("\n===== Enter details for Student " + (i + 1) + " =====");
            students[i] = new Student();
            students[i].getStudentDetails();
            students[i].getMarks();
            students[i].computeSGPA();
            sc.nextLine(); 
        }

        System.out.println("\n===== Displaying Results =====");
        for (int i = 0; i < 2; i++) {
            students[i].displayDetails();
        }
    }
}
