import java.util.Locale;
import java.util.Scanner;


public class Task12 {
    public static void main(String[] args) {
        System.out.println("Введите I like Java!!!");
        Scanner scan = new Scanner(System.in);
        String ilikejava = scan.nextLine();
        int count = 0;
        if (ilikejava.contains("Java")) {
            System.out.println("Содержит Java");
            count++;
        }
        if (ilikejava.startsWith("I like")) {
            System.out.println("Начинается с I like");
            count++;
        }
        if (ilikejava.endsWith("!!!")) {
            System.out.println("Заканчивается на !!!");
            count++;
        }
        if (count == 3) {
            System.out.println(ilikejava.toUpperCase());
        }
        ilikejava = ilikejava.replace('a','o');
        System.out.println(ilikejava.substring(7,11));
    }
}
