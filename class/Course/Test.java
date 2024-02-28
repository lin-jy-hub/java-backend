package Course;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Course c1 = new Course("course1");
        Course c2 = new Course("course2");
        c1.addStudent("Peter Jones");
        c1.addStudent("Brian Smith");
        c1.addStudent("Anne Kennedy");
        c2.addStudent("Peter Jones");
        c2.addStudent("Steve Smith");
        System.out.println("Number of students in " + c1.getCourseName() + ":" + c1.getNumberOfStudents());
        System.out.println(Arrays.toString(c1.getStudents()));
        System.out.println("Number of students in " + c2.getCourseName() + ":" + c2.getNumberOfStudents());
        System.out.println(Arrays.toString(c2.getStudents()));
    }
}
