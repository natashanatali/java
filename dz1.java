// Задать одномерный массив и найти в нем минимальный и максимальный элементы.

package Homework..;

public class task_1 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 1, 15};
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
    }


    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i: arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i: arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}