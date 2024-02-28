package Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Jack";
        Student student = new Student();
        student.name = "Tom";
        Employee employee = new Employee();
        employee.name = "Jim";
        Faculty faculty = new Faculty();
        faculty.name = "Mark";
        Staff staff = new Staff();
        staff.name = "Susie";
        staff.title = "director";
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString() + "'s title is " + staff.title);
    }
}
