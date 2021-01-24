public class Main{
    public static void main(String[] a) {
        Circle c1 = new Circle(10f);
        printCircle(c1);
    }

    public static void printCircle(Circle c){
        System.out.println("radius of circle = " + c.getRadius() + '\n' +
                "area of circle = " + c.area());
    }
}

class Circle{
    private float radius;
    public static final float PI = 3.1414f;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public void setRadius(float radius) {
        if(radius >= 0f){
            this.radius = radius;
        }
    }

    private float square(float radius){
        return radius * radius;
    }

    public float area(){
        return PI * square(this.radius);
    }
}





