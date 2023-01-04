package lesson_2.task_1;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Вы ввели число: " + userNumber());
        } catch (Exception e) {
            System.out.println("Сработал InputMismatchException т.к вы ввели не число!");
            userNumber();
        }
    }

    public static float userNumber(){
        System.out.println("Введите число типа float");
        boolean b;
        Scanner scanner = new Scanner(System.in);
        float userNum = scanner.nextFloat();
        return userNum;
    }
}



