import java.util.Scanner;

/**
 * @author Tatyana Boyko
 */
public class Choice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            do {
                switch (userSelectApp(scan)) {
                    case 1:
                        Calculator.start(scan);
                        break;
                    case 2:
                        LengthWord.start(scan);
                        break;
                    default:
                        System.out.println("Некорректный выбор:)");
                        break;
                }
            } while(userSelectNextApp(scan));
        } finally {
            scan.close();
        }
    };

    /**
     * Дает пользователю возможность выбрать приложение для запуска
     *
     * @param scan общий сканнер для консоли
     * @return номер выбранного приложения
     */
    private static Integer userSelectApp(Scanner scan) {
        System.out.println("Доступны два приложения: ");
        System.out.println("1 - калькулятор,");
        System.out.println("2 - поиск максимального слова.");
        System.out.print("Введите номер приложения: ");
        return scan.nextInt();
    };

    /**
     * Дает пользователю возможность выбрать следующее приложение или завершить работу
     *
     * @param scan общий сканнер для консоли
     * @return флаг следующего приложения
     */
    private static Boolean userSelectNextApp(Scanner scan) {
        System.out.println("\nЗапустить другое приложение? (да/нет) ");
        return (scan.next().equals("да"));
    };
}
