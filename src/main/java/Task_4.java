import java.lang.Math;
import java.util.Scanner;


public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        double avg = ((x + y + z) / 3);
        System.out.println(avg);
        if (Math.floor(avg / 2) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
