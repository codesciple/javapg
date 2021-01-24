public class Main{
    public static void main(String[] a) {
        Circle c1 = new Circle(10f);
        printCircle(c1);
    }

    public static void printCircle(Circle c){
        System.out.println("area of circle = " + c.area());
    }
}

class Circle{
    private float radius;
    public static final float PI = 3.1414f;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }
}





