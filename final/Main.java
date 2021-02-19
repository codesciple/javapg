public class Main{
    public static void main(String[] a){
        Circle c1 = new Circle(10f);
        System.out.println("area of circle = " + c1.area());

        Circle c2 = new Circle(20f);
        System.out.println("area of circle = " + c2.area());

        Circle c3 = new Circle(15f);
        System.out.println("area of circle = " + c3.area());
        System.out.println("circumference of circle = " + c3.circumference());
    }
}

class Circle{
    public float radius;
    public static final float PI = 3.1414f;

    public Circle(){
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }

    public float circumference(){
        return 2 * PI * this.radius;
    }
}





