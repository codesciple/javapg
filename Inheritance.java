import java.util.Scanner;
class Main {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        // Enter month
        String month = scan.next();
        // Enter date
        int date = scan.nextInt();

        int day = 0;
        switch (month) {
            case "January":
                day = date;
                break;
            case "February":
                day = 31 + date;
                break;
            case "March":
                day = 31 + 28 + date;
                break;
            case "April":
                day = 31 + 28 + 31 + date;
                break;
            case "May":
                day = 31 + 28 + 31 + 30 + date;
                break;

            case "June":
                day = 31 + 28 + 31 + 30 + 31  + date;
                break;

            case "July":
                day = 31 + 28 + 31 + 30 + 31 + 30 + date;
                break;

            case "August":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + date;
                break;
            case "September":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + date;
                break;
            case "October":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
                break;
            case "November":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
                break;
            case "December":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
                break;
            // Write the rest of the logic

        }

        // From the day number of the year, finding the day no. of the week
        int dayNumber = day % 7;
        // recall, day 1 is Monday

        if (dayNumber==6 || dayNumber==7 ) {
            System.out.print("Hurray!");
        } else {
            System.out.print("Ohhh! It's a work day :|");
        }

        scan.close();


    }

}