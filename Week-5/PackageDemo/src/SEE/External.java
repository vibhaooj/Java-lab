package SEE;

import CIE.Personal; 

public class External extends Personal {
    public int[] seeMarks = new int[5];

    public External(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void setSEEMarks(int[] marks) {
        for (int i = 0; i < 5; i++) {
            seeMarks[i] = marks[i];
        }
    }

    public void displaySEE() {
        System.out.print("SEE Marks: ");
        for (int m : seeMarks)
            System.out.print(m + " ");
        System.out.println();
    }
}
