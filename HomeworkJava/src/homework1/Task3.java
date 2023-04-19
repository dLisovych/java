package homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // 1.  определить переменные а и б
        // 1.1 ввести в консоли число а
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();// sc.nextLine() - позволяет вводить данные с консоли
        int a = Integer.parseInt(input);
        int b = Integer.parseInt(sc.nextLine());// Integer.parseInt() - преобразует строку в число

        // 1.2 ввести в консоли число б
        // 2.  вывести результат вычесление а и б
        // 2.1 вывести сумму а и б
        // 2.1.1 сложить,вычитать,умножить,разделить а и б
        double sum= a + b;
        double sum2 = a - b;
        double sum3 = a * b;
        double sum4 = a / b;
        // 2.1.2 вывести результаты сложение в консоль
        System.out.println("сумма        " + sum);
        // 2.2 вывести разность а и б
        System.out.println("разность     "  + sum2);
        // 2.3 вывести произведение а и б
        System.out.println("произведение " + sum3);
        // 2.4 вывести часное а и б
        System.out.println("частное      " + sum4);
    }
}