//  Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//  каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
//  Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int sizeMatr = 5;
        int[] arr1 = { 75, 125, 12, 36, 75 };
        int[] arr2 = { 25, 5, 4, 6, 10 };
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов разные");
        }
        printMatr3(initArr3(sizeMatr, arr1, arr2));
    }

    public static int[] initArr3(int size, int[] arr1, int[] arr2) {
        int[] arr3 = new int[size];
        for (int i = 0; i < size; i++) {
            arr3[i] = arr1[i] / arr2[i];
        }
        return arr3;
    }

    public static void printMatr3(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}
