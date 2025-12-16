package CIE;

public class Internals extends Student {

    int[] marks;

    public Internals(int usn, String name, int sem, int[] marks) {
        super(usn, name, sem);

        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }
}
