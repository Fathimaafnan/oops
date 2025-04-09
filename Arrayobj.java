class Student {
    String name;
    int rollno;
    int mark;
}

public class Arrayobj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "anu";
        s1.rollno = 1;
        s1.mark = 90;

        Student s2 = new Student();
        s2.name = "faiz";
        s2.rollno = 2;
        s2.mark = 80;
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].name + ": " + students[i].mark);
            }
        }
    }
}

