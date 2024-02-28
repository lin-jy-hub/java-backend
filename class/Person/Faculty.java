package Person;

public class Faculty extends Employee{
    public final static int LECTURER = 1;
    public final static int ASSISTANT_PROFESSOR = 2;
    public final static int ASSOCIATE_PROFESSOR = 3;
    public final static int PROFESSOR = 4;
    String officeHours;
    int rank;
    public String toString() {
        return "Faculty " + name;
    }
}
