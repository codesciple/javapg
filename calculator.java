public class calculator{
    public static void main(String[] args){
        calculator myCalculator = new calculator();

        int result = myCalculator.modulo(11,2);

        System.out.println(result);

    }
    public calculator(){
        // this is a constructor

    }



    public int add(int a, int b){
        //this is a method

        return a+b;

    }

    public int subtract(int a, int b){
        return a-b;

    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }

    public int modulo(int a, int b){
        return a%b;
    }

}