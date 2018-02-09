import java.util.Scanner;

/**
 * @author  Tatyana Boyko
 */
//* Основные функции калькулятора (сложение, вычитание, умножение и деление) для 2-х чисел с округлением результата до 4-х знаков после запятой

public class Calculator {
    public Calculator(){}
    static Scanner scan = new Scanner(System.in);
    public static void start(Scanner scan){
        System.out.println("Введите первое число: ");
        double number1 = scan.nextDouble();
        System.out.println("Введите второе число: ");
        double number2 = scan.nextDouble();
        System.out.println("Введите операцию: (+, -, /, *):");
        char operation =scan.next().charAt(0);
        double result = calc(number1,number2,operation);
        System.out.printf("Результат: %.4f.\n", result);
    }
    public static double calc(double number1, double number2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(number1, number2, operation =scan.next().charAt(0));
        }
        return result;
    }
}