import java.util.*;
public class even {

    public static void main(String[] args) {

        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        //write your code here
        if(n%2==0){
            System.out.println("The number entered is even");
        }else{
            System.out.println("The number entered is odd");
        }
    }
}