package Chapter3;

import java.util.Scanner;

/*
All salespeople get a payment of $1000 a week
Salespeople who exceed 10 sales get an additional bonus of $250
 */
public class IfStatements {
    public static void main(String[] args) {
//        Initialize the known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10

//        Get values for unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
//        Quick detour for the bonus earners
        if(sales > quota) {
            salary += bonus;
        } else {
            System.out.print("The employee was short " + (quota - sales)+ " sales to hit the bonus. ");
        }
        System.out.print("The employee's pay is $"+salary+"");
//        Output

    }
}