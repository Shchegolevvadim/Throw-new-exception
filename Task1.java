
// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Integer a = 25;
        Integer b = 5;

        method1(a, b);
        method2(a, b);
        method3(a, b);

    }

    public static void method1(int a, int b) {
        if (a % b == 0) {
            System.out.println("Число a делиться на b");
        } else {
            throw new RuntimeException("Число a не делится на число b");
        }
    }

    public static void method2(int a, int b) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (c < b) {
            throw new RuntimeException("Число меньше нужного диапазона");
        }
        if (c <= a && c >= b) {
            System.out.println("Число нужного диапазона");
        } else {
            throw new RuntimeException("Число больше нужного интервала");
        }
    }

    public static void method3(int a, int b) {
        Scanner sc1 = new Scanner(System.in);
        int d = sc1.nextInt();
        if (d <= a && d >= b) {
            int result = d * d;
            System.out.println("квадрат числа в диапазоне равен");
            System.out.println(result);
        } else {
            throw new RuntimeException("число не входит в диапазон");
        }
    }

}
// Всего 4 исключения
