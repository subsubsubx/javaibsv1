import java.util.Scanner;

public class Finaltask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. Что это?");
        String answer = "Заархивированный вирус";

        int count = 0;

        while (count < 3) {
            String input = scan.nextLine();
            switch (input) {
                case "Подсказка": {
                    if (count != 0) {
                        System.out.println("Подсказка уже недоступна");
                    }
                    if (count == 0) {
                        System.out.println("Вместе с ЭТИМ школьники обычно скачивают читы");
                        input = scan.nextLine();
                        if (answer.equals(input)) {
                            System.out.println("Правильно!");
                            return;
                        } else {
                            System.out.println("Обидно, приходи в другой раз");
                            return;
                        }
                    }
                }
                break;
                case "Заархивированный вирус": {
                    System.out.println("Правильно!");
                    return;
                }
                default: {
                    if (count == 2) {
                        System.out.println("Обидно, приходи в другой раз");
                        return;
                    }
                    System.out.println("Подумай еще!");
                    count++;
                }

            }
        }


    }
}