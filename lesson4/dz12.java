package Homework.Lesson_4;

import java.util.LinkedList;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();

        while (true) {
            System.out.print("Введите строку: ");
            String text = in.nextLine();
            int size = wordsList.size();

            if (text.equals("print")) {
                LinkedList<String> reversWordList = new LinkedList<>();
                for (int i = size - 1; i >= 0; i--) {
                    reversWordList.add(wordsList.get(i));
                }
                System.out.println(reversWordList);

            } else if (text.equals("revert")) {
                wordsList.remove(size - 1);
                System.out.println(wordsList);

            } else {
                wordsList.add(text);
                System.out.println(wordsList);
            }
        }
    }
}