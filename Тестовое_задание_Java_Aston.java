import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание №1");
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = scan.nextInt();
        System.out.println("Первое число: " + num1);

        System.out.println();
        System.out.println("Введите второе число:");
        int num2 = scan.nextInt();
        System.out.println("Второе число: " + num2);


        if (num1 > num2) {
            System.out.println("Первое число больше второго числа" );
        } else if (num1 == num2) {
            System.out.println("Первое и второе числа равны");
        } else {
            System.out.println("Второе число больше первого числа");
        }

        System.out.println("");
        System.out.print("Сумма этих чисел: " + num1); System.out.print(" + " + num2); System.out.println(" = " + (num1 + num2));

        System.out.println("");
        System.out.print("Разность этих чисел: "+ num1); System.out.print(" - " + num2); System.out.println(" = " + (num1 - num2));

        System.out.println("");
        if (num1 == 0 || num2 == 0) {
            System.out.print("Частное этих чисел: одно из чесел равно нулю, деление невозмоджно");
        } else {
            float z = (float) num1 /  num2;
            System.out.print("Частное этих чисел: "+ num1); System.out.print(" / " + num2); System.out.println(" = " + z);
        }

        System.out.println("");
        System.out.print("Произведение этих чисел: "+ num1); System.out.print(" / " + num2); System.out.println(" = " + (num1 * num2));

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Задание №2");
        System.out.println("");




        System.out.println();
        System.out.println("Введите первую строку:");
        String a = scan.nextLine();
        String str1 = scan.nextLine();
        System.out.println(str1);

        System.out.println();
        System.out.println("Введите вторую строку:");
        String str2 = scan.nextLine();
        System.out.println(str2);


        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Задание №3");
        System.out.println("");

        int[] mas = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Массив: " + Arrays.toString(mas));

        for (int j = 0; j < mas.length; j++) {

            if (j % 2 == 0)
                continue;
            System.out.println("Число: "+ mas[j]);
        }

    }
}
