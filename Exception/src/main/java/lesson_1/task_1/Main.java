//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
package lesson_1.task_1;

public class Main {

    public static void main(String[] args) {
//        calc(5, 0);

//        findEl(2);

        findChar("u");
    }

    public static void calc(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Делить на 0 нельзя!!!");
        } else {
            System.out.println(a / b);
        }
    }

    public static void findEl(int index) {
        int[] arr = new int[]{1, 2, 3};
        if (index > arr.length - 1) {
            throw new RuntimeException("Массив не такой длинный!!!");
        } else {
            System.out.println(arr[index]);
        }
    }

    public static void findChar(String el){
        String str = "come over here";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == el.charAt(0)){
                count++;
                throw new RuntimeException("Есть такая буква");
            }
        }
        if (count == 0){
            System.out.println("В строке нет такой буквы");
        }
    }
}
