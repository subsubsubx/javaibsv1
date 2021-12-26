import java.util.Arrays;
import java.util.Scanner;


public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива");
        int size = scan.nextInt(); // кол-во
        double[] nums = new double[size];
        double avg1 = 0; // сумма элементов массива
        ;
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент " + (i+1));
            nums[i] = scan.nextDouble();
            avg1 += nums[i];
        }
        double avg2 = avg1 / size; // среднее арифметическое
        System.out.println("Среднее арифметическое массива: " + avg2);
        for (int i = 0; i < size; i++) {
            nums[i] *= avg2;
        }
        System.out.println("Элементы помноженные на avg: " + Arrays.toString(nums));
    }
}