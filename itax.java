import java.util.Scanner;
class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();

        double tax = 0.0;

        // Write your logic here

        //age >=80 slab
        if(age >= 80 ){
            if(income > 1000000){
                tax = (income- 1000000)*0.30 + (1000000 - 500000)*0.20;
            }else if(income > 500000 && income <= 1000000){
                tax = (income - 500000)*0.20;
            }
        }


        //age >= 60 && age<80 slab
        if(age>=60 && age<80){
            if(income > 1000000){
                tax = (income- 1000000)*0.30 + (1000000 - 500000)*0.20 + (500000- 250000)*0.10;
            }else if(income > 500000 && income <= 1000000){
                tax = (income - 500000)*0.20 + (500000- 250000)*0.10;
            }else if(income > 300000 && income <= 500000){
                tax = (income - 300000)*0.20 + (300000- 250000)*0.10;
            }
        }

        //age<60 slab
        if(age < 60){
            if(income > 1000000){
                tax = (income- 1000000)*0.30 + (1000000 - 500000)*0.20 + (500000- 250000)*0.10;
            }else if(income > 500000 && income <= 1000000){
                tax = (income - 500000)*0.20 + (500000- 250000)*0.10;
            }else if(income > 300000 && income <= 500000){
                tax = (income - 300000)*0.20 + (300000- 250000)*0.10;
            }else if(income > 250000 && income <= 300000){
                tax = (income- 250000)*0.10;
            }
        }




        System.out.print(tax);
        scan.close();
    }
}
