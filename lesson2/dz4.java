// Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает boolean значение).

package Homework.lesson_2;

import java.util.Scanner;

public class OneTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(isPalindrome(string));

    }

    private static boolean isPalindrome(String string) {
        String newString = string.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed =new StringBuffer(newString).reverse().toString();
        return reversed.equals(newString);
    }  
}