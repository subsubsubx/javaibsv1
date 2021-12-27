import java.util.Scanner;

public class Finaltask2 {
    public static void main(String[] args) {
        System.out.println("Запишите уравнение");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        char operation = input.charAt(1);
        int xpos = input.indexOf("x");
        if ((xpos == 0) && (operation == '+')) { //x+3=4
            System.out.println("x равен: " + (Integer.parseInt(input.substring(4)) - Integer.parseInt(input.substring(2, 3))));
        } else if ((xpos == 0) && (operation == '-')) { //x-3=4
            System.out.println("x равен: " + (Integer.parseInt(input.substring(4)) + Integer.parseInt(input.substring(2, 3))));
        } else if ((xpos == 2) && (operation == '+')) { //4+x=7
            System.out.println("x равен: " + (Integer.parseInt(input.substring(4)) - Integer.parseInt(input.substring(0, 1))));
        } else if ((xpos == 2) && (operation == '-')) { //4-x=2
            System.out.println("x равен: " + (Integer.parseInt(input.substring(0, 1)) - Integer.parseInt(input.substring(4))));
        } else if ((xpos == 4) && (operation == '+')) { //4-4=x
            System.out.println("x равен: " + (Integer.parseInt(input.substring(0, 1)) + Integer.parseInt(input.substring(2, 3))));
        } else if ((xpos == 4) && (operation == '-')) { //4-4=x
            System.out.println("x равен: " + (Integer.parseInt(input.substring(0, 1)) - Integer.parseInt(input.substring(2, 3))));
        }
    }
}
