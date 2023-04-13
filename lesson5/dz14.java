// Написать программу, которая найдёт и выведет повторяющиеся 
// имена с количеством повторений. Отсортировать по убыванию популярности.

package Homework.lesson_5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class task_2 {
    public static void main(String[] args) {
        Map<String, Integer> workerMap = new HashMap<>();
        String employees = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";

        String[] listWorker = employees.split(" ");
        for (int i = 0; i < listWorker.length; i += 2) {
            if (workerMap.containsKey(listWorker[i])) {
                workerMap.replace(listWorker[i], workerMap.get(listWorker[i]) + 1);
            } else {
                workerMap.put(listWorker[i], 1);
            }
        }


        Map<String, Integer> sortedWorkerMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : workerMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : workerMap.entrySet()) {
                String key = entry.getKey();
                if (workerMap.get(key) == i) {
                    sortedWorkerMap.put(key, workerMap.get(key));
                }
            }
        }
        System.out.println(sortedWorkerMap);
    }
}