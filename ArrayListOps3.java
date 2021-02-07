import java.util.*;

public class ArrayListOps3 {
  public static void main(String[] args) {
    ArrayList<Student> studentList = new ArrayList<Student>();
    Student s1 = new Student("Sujit",1);
    Student s2 = new Student("Siddharth",2);
    Student s3 = new Student("Karanpreet",3);
    Student s4 = new Student("Hari",5);
    Student s5 = new Student("Tricha",4);

    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(s4);

    System.out.println("s1 contained?"+ studentList.contains(s1));
    System.out.println("s5 contained?"+ studentList.contains(s5));
    printStudentList(studentList);

  }

  public static void printStudentList(ArrayList<Student> students) {
    for(Student s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Student {
  private final String name;
  private final int rollNumber;

  public Student(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}

/*
  SUMMARY
  =======
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
  2. This is a type-safe approach of creating containers. Any attempt to add an element which is
      type-incompatible with the declared contained type will fail at the static type checking stage,
      resulting in a compile error.

*/
