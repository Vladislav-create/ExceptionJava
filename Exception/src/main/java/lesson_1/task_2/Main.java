//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

package lesson_1.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 5};
        int[] arr2 = new int[]{2, 4, 6};

        System.out.println(Arrays.toString(getNewArray(arr1, arr2)));

    }

    public static int[] getNewArray(int[] arr1, int[] arr2) {
        int[] resultArr = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длинна массивов разная");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                resultArr[i] = arr1[i] - arr2[i];
            }
            return resultArr;
        }
    }

}