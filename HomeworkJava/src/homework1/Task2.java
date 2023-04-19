package homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        String input = sc.nextLine();
        double a =Integer.parseInt(input);
        n++;
        String secondInput = sc.nextLine();
        double b = Integer.parseInt(secondInput);
        n = n + 1;
        String thirdInput = sc.nextLine();
        double c = Integer.parseInt(thirdInput);
        n = n + 1;

        double sum = (a + b + c)/n;
        System.out.println(sum);



    }
}