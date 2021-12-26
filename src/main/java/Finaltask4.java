import java.util.Scanner;

public class Finaltask4 {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает, что же это?");
        String answer = "Заархивированный вирус";
        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if (input.equals(answer)) {
                System.out.println("Правильно!");
                break;
            } else if (i == 0 && (input.equals("Подсказка"))) {
                System.out.println("Обычно вместе с ЭТИМ школьники скачивают бесплатные читы");
                i++;
            } else if ((i == 1 || i == 2) && (input.equals("Подсказка"))) {
                System.out.println("Подсказка уже недоступна!");
            } else if (i == 0 || i == 1) {
                System.out.println("Подумай еще!");
            } else {
                System.out.println("Обидно, приходи в другой раз.");
            }
        }
    }
}
