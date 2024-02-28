package Person;

public class Student extends Person{
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 1;
    public final static int JUNIOR = 1;
    public final static int SENIOR = 1;
    int status;
    public String toString() {
        return "Student " + name;
    }
}
