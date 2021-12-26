import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int hor = scan.nextInt(); // вводим кол-во строк
        System.out.println("Введите количество столбцов");
        int vert = scan.nextInt(); // вводим кол-во столбцов
        int[][] matrix = new int [hor][vert]; // массив из целочисленных элементов
        for (int i = 0; i < hor; i++) {
            for (int j = 0; j < vert; j++) {
                System.out.println("Введите элемент " + (i+1) +":" + (j+1));
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Первая строка, помноженная на 3: ");
        for (int i = 0; i < hor; i++){
            for (int j = 0; j < vert; j++){
                if (i == 0){
                    System.out.print(matrix[i][j] * 3 + " ");
                }
            }
        }
    }
}