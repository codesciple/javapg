
interface Person {
   public abstract String getDetails();
   public abstract float computeSalary();
}

class Student implements Person{
  protected final int rollNumber;
  protected int year;

  protected static final int annualFees = 10000;
  protected static final int annualSalary = 15000;

  public Student(int rollNumber, int year) {
    this.rollNumber = rollNumber;
    this.year = year;
  }


  public String getDetails() {
    return "Roll Number : " + rollNumber + '\n' +
            "Fees : " + this.computeFees();
  }

  protected float computeFees() {
    return Student.annualFees * year;
  }

  public float computeFees(int annualFees){
    return Student.annualFees * this.year;
  }

  public float computeSalary() {
    return Student.annualSalary * this.year;
  }
}

class Professor implements Person {
  private int employeeNumber;
  private static final float startingSalary = 50000;

  public Professor(int employeeNumber) {
    this.employeeNumber = employeeNumber;
  }
  public String getDetails(){
      return "Employee Number : " + this.employeeNumber;
    }

  public float computeSalary(){
    return this.startingSalary;

  }

}


class ResearchStudent extends Student {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent(int rollNumber, int year, String researchArea) {
    super(rollNumber, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student.annualFees * this.year*0.9f;
  }


  }


public class IandP12 {
  public static void main(String[] a) {

    Student s1 = new Student(200, 2);
    //System.out.println(s1.getDetails());

    ResearchStudent s2 = new ResearchStudent(300, 3, "Software Engineering");
    //System.out.println(s2.getDetails());

    Professor p1 = new Professor(100);

    Person[] array = {s1, s2, p1};
    printDetails(array);


  }

  public static void  printDetails (Person [] persons) {
    for (Person person: persons) {
      System.out.println(person.getDetails());
      System.out.println("Salary: " + person.computeSalary());
    }
  }


}

