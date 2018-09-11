import java.util.Scanner;

/**@author Khaustovich E.

 */

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
        int i = scanner.nextInt();
        System.out.println("Введите 1 число");
        double m = scanner.nextDouble();
        System.out.println("Введите 2 число");
        double n = scanner.nextDouble();
        double result = 0;
        if (i == 1) {
            result = m + n; //сложение
            System.out.printf("Результат вычисления: %.4f", result);
        }
        else if (i == 2) {
            result = m - n; //вычитание
            System.out.printf("Результат вычисления: %.4f", result);
        }
        else if (i == 3) {
            result = m * n; //умножение
            System.out.printf("Результат вычисления: %.4f",  result);
        }
        else if (i == 4) {
            result = m / n; //деление
            System.out.printf("Результат вычисления: %.4f", result);
        }
        else System.err.println("Неправильно выбрана операция");

        scanner.close();


    }
}
