package homework1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. вывести в консоль “How are you?“
        System.out.println("How are You?");
        // 2. создать переменную типа String с именем переменной answer
        String answer = sc.nextLine();
        // 3. вывести в консоль "You are (answer)"
        System.out.println("You are " + answer);
        // answer = "fine";// инициализация переменной
    }
}