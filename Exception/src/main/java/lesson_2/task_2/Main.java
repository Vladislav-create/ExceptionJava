//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package lesson_2.task_2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String str = scanner.nextLine();
    public static void main(String[] args) {

        checkStr(str);
    }
    public static void checkStr(String str){
        if (str.length()==0){
            throw new RuntimeException("Вы ввели пустую строку");
        } else {
            System.out.println("Вы ввели: " + str);
        }
    }
}
