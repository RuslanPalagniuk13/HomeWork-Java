/** Задача 1:
 * Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл.
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;

 public class task2_1 {
 
    public static int[] randomArr() {
        Random rand = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return arr;
    }

    public static int[] babblSort(int arr[]) throws IOException {
        Logger loger = Logger.getLogger(task2_1.class.getName());
        FileHandler fh = new FileHandler("Task2_1.tx");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fh.setFormatter(sFormatter);
        loger.addHandler(fh);

        int temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            loger.info(Arrays.toString(arr));
        }
        return arr;

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {

        print(babblSort(randomArr()));
    }

}