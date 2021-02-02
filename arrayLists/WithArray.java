public class WithArray {

  public static void main(String[] args) {
    String studentList[] = {"Sujit", "Siddharth", "Karanpreet"};
    printStudentList(studentList);
  }

  public static void printStudentList(String[] students) {
    for(String s : students) {
      System.out.println(s);
    }
    
  }
}

/*
  SUMMARY
  =======
  1. Collection of students can be represented as an array
*/
