class Student {
  protected final String name;
  protected int year;

  private static final int annualFees = 10000;

  public Student(String name, int year) {
    this.name = name;
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + computeFees();
  }

  public int computeFees() {
    return Student.annualFees * year;
  }
}

class ResearchStudent extends Student {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  public String getDetails() {
      return this.name + " is a research student with research area" + researchArea + " and he/she is in his/her year: " + year;
    }
  }


class PhDStudent extends ResearchStudent {
  private String thesisTitle;
  private static final int annualFees = 10000;

  public PhDStudent(String name, int year, String researchArea, String thesisTitle) {
    super(name, year, researchArea);
    this.thesisTitle = thesisTitle;
  }

  public String getDetails() {
      return this.name + " is a PhD student with research area" + researchArea + " and he/she is in his/her year: " + year + ". He/She working on the thesis titled " + thesisTitle;
    }
  }




public class IandP9_1 {
  public static void main(String[] a) {

    Student s1 = new Student("karan", 3);
//    System.out.println(s1.getDetails());

    ResearchStudent s2 = new ResearchStudent("siddharth", 4, "Software Engineering");
//    System.out.println(s2.getDetails());

    PhDStudent s3 = new PhDStudent("hari", 1, "Software Engineering", "Automated Evaluation");
//    System.out.println(s3.getDetails());

    Student[] array = {s1, s2, s3};
    printDetails(array);


  }

  public static void printDetails (Student [] students)
  {for (Student student: students){
    System.out.println(student.getDetails());
    }
  }
}

