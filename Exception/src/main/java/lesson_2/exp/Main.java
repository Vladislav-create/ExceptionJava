package lesson_2.exp;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdasd", "asdadad"};
            String strings1 = strings[strings.length-1];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("asdadadadasdadas");
        } catch (StackOverflowError error) {
            System.out.println("Стек переполнен");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("я жив!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }

//    public static void readFile() {
//        Map<String, Integer> map = new LinkedHashMap<>();
//        BufferedReader txt = null;
//        try {
//            txt = new BufferedReader(new FileReader("C:\\Users\\29-vi\\Desktop\\Work\\ExceptionJava\\Exception\\src\\main\\java\\lesson_2\\task_1\\test.txt"));
//            String line;
//            while ((line = txt.readLine()) != null) {
//                String name = line.split("=")[0];
//                Integer length = 0;
//                try {
//                    length = Integer.parseInt(line.split("=")[1]);
//                } catch (NumberFormatException e) {
//                    length = name.length()/2;
//                }
//                map.put(name, length);
//            }
//        } catch (IOException e) {
//            System.out.println("Файл не найден.");
//        } finally {
//            try {
//                txt.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println(map);
//    }

//        sum2D(new String[][]{{"a", "s"}, {"z", "c"}});
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[10];
//        System.out.println("Укажите индекс элемента, в который хотите записать 1");
//        int index = 0;
//        if (scanner.hasNextInt()){
//            index = scanner.nextInt();
//        }
//        try {
//            arr[index] = 1;
//        } catch (Exception e){
//            System.out.println("Вы ввели индекс вне массива");
//        }
//        System.out.println(index);
//    }
//    public static int sum2D(String[][] arr) {
//        int sum =0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < 5; j++) {
//                try {
//                    int val = Integer.parseInt(arr[i][j]);
//                    sum+=val;
//                } catch (NumberFormatException e) {
//                    System.out.println("Переданы массивы не с цифрами. Заменены на 0.");
//                    arr[i][j] = "0";
//                } catch (ArrayIndexOutOfBoundsException e) {
//                    System.out.println("Мвссивы не такие длинные");
//                }
//            }
//        }
//        return sum;
//    }

}

