package com.company;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        File inputfile = new File("/Users/nadeem/Documents/programming/personalprojects/javapg/quiz_numbers.txt");
        Scanner scan = new Scanner(inputfile);

        double sum = 0;
        double numb = 0;
        double mean;
        while(scan.hasNext()){
            numb++;
            double number = scan.nextInt();
            sum = sum + number;

        }

        System.out.println(mean = sum/numb);

    }
}
