import java.util.Scanner;


public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int n = scan.nextInt();
        int res = 0;
        if (n <= 0) {
            System.out.println("Число <= 0");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    res += i;

                }
            }
            System.out.println("Итого: " + res);
        }
    }
}