package Course;

import java.util.ArrayList;

public class Course {
  private String courseName;
  private ArrayList<String> students = new ArrayList<>();

  public Course(String courseName) {
    this.courseName = courseName;
  }

  public void addStudent(String student) {
    students.add(student);
  }

  public String[] getStudents() {
    String []s = new String[students.size()];
    for(int i = 0; i < students.size(); ++i) {
      s[i] = students.get(i);
    }
    return s;
  }

  public int getNumberOfStudents() {
    return students.size();
  }

  public String getCourseName() {
    return courseName;
  }
}
