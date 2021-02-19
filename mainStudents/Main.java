public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1056, "karan");
        s1.displayProfile();
        System.out.println("Percentage of " + s1.getName() + " is " + s1.findPercentage());
        s1.setCgpa(8.8);
        System.out.println("Percentage of " + s1.getName() + " is " + s1.findPercentage());
    }
}


class Student {
    private int rollno;
    private String name;
    private double cgpa;

    public Student(int r,String n){
        rollno = r;
        name = n;
    }


    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
    }
    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }
}