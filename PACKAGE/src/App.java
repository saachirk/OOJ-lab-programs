import java.util.Scanner;
import CIE.*;
import SEE.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Internals[] internals = new Internals[n];
        Externals[] externals = new Externals[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter USN: ");
            int usn = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Semester: ");
            int sem = sc.nextInt();

            int[] im = new int[5];
            int[] em = new int[5];

            System.out.println("Enter 5 internal marks:");
            for (int j = 0; j < 5; j++) {
                im[j] = sc.nextInt();
            }

            System.out.println("Enter 5 external marks:");
            for (int j = 0; j < 5; j++) {
                em[j] = sc.nextInt();
            }

            internals[i] = new Internals(usn, name, sem, im);
            externals[i] = new Externals(usn, name, sem, em);
        }

        System.out.println("\nPROGRAM COMPLETED SUCCESSFULLY");
        sc.close();
    }
}
