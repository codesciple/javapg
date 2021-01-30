class Student {
  protected final String name;
  protected int year;

  protected static final int annualFees = 10000;

  public Student(String name, int year) {
    this.name = name;
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + computeFees();
  }

  protected float computeFees() {
    return Student.annualFees * year;
  }

  public float computeFees(int annualFees){
    return annualFees * this.year;
  }

}

class ResearchStudent extends Student {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student.annualFees * this.year*0.9f;
  }


  }


public class IandP9_2 {
  public static void main(String[] a) {

    Student s1 = new Student("karan", 3);
    System.out.println(s1.getDetails());

    ResearchStudent s2 = new ResearchStudent("siddharth", 3, "Software Engineering");
    System.out.println(s2.getDetails());


  }


}

