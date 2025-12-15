import java.util.*;
import CIE.*;
import SEE.*;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        External[] students = new External[n];
        Internals[] internals = new Internals[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); 
            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("USN: ");
            String usn = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            students[i] = new External(usn, name, sem);
            internals[i] = new Internals();

            int[] inMarks = new int[5];
            System.out.println("Enter 5 Internal Marks:");
            for (int j = 0; j < 5; j++)
                inMarks[j] = sc.nextInt();
            internals[i].setMarks(inMarks);

            int[] seeMarks = new int[5];
            System.out.println("Enter 5 SEE Marks:");
            for (int j = 0; j < 5; j++)
                seeMarks[j] = sc.nextInt();
            students[i].setSEEMarks(seeMarks);
        }

        System.out.println("\n--- FINAL MARKS ---");
        for (int i = 0; i < n; i++) {
            students[i].displayPersonal();
            int[] finalMarks = new int[5];
            System.out.print("Final Marks: ");
            for (int j = 0; j < 5; j++) {
                
                finalMarks[j] = (internals[i].internalMarks[j] / 2) + (students[i].seeMarks[j] / 2);
                System.out.print(finalMarks[j] + " ");
            }
            System.out.println("\n-------------------");
        }

        sc.close();
    }
}
