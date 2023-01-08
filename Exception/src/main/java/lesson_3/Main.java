package lesson_3;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String userData = "";
    public static String[] verifiedData;
    public static String surname;
    public static String name;
    public static String middleName;
    public static String dateOfBirth;
    public static long phoneNumber;
    public static String gender;
    public static String genders = "fm";


    public static void main(String[] args) {

        requestingUserData();
        System.out.println(userData);
        checkUserData(userData);
        if (surname != null) {
            createFile(userData);
        } else {
            surname = verifiedData[0];
            createFile(userData);
        }
    }

    public static void requestingUserData() {
        System.out.println("Введите данные пользователя в формате: " +
                "фамилия имя отчество, дата рождения, номер телефона, пол(м или ж). Через пробел.");
        Scanner scanner = new Scanner(System.in);
        userData = scanner.nextLine();
    }

    public static void checkUserData(String data) {
        verifiedData = data.split(" ");
        if (verifiedData.length < 6) {
            System.out.println("Вы ввели недостаточно данных!");
        } else {
            try {
                surname = verifiedData[0];
                name = verifiedData[1];
                middleName = verifiedData[2];
                dateOfBirth = verifiedData[3];
                phoneNumber = Long.parseLong(verifiedData[4]);
                gender = verifiedData[5];
                System.out.println(gender);
                if (dateOfBirth.length() != 10) {
                    System.out.println("Вы ввели некорректную дату рождения");
                }
                if (!genders.contains(gender)) {
                    System.out.println("Вы неверно указали пол. Введите 'м' или 'ж'");
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели некорректный номер телефона!");
            }

        }
    }

    public static void createFile(String data) {
        System.out.println(surname);
        String fileName = surname + ".txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(userData + "\n");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
