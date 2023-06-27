import java.util.InputMismatchException;
import java.util.Scanner;
public class Homework1Task1 {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        try {
            System.out.print("Введите целочисленный числитель: ");
            int divisible = aScanner.nextInt();
            System.out.print("Введите целочисленный знаменатель: ");
            int divider = aScanner.nextInt();
            System.out.printf("Ответ: %s / %s = %s", divisible, divider, divisible / divider);
        } catch (InputMismatchException ex1) {
            System.out.println("Ошибка. Введите целое.");
        } catch (ArithmeticException ex2) {
            System.out.println("Ошибка. Делить на ноль нельзя.");
        }
        aScanner.close();
    }
}
