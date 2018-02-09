import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


/**
 * @author  Tatyana Boyko
 */
//* Поиск слова с максимальной длиной и вывод слова и размера его длины на консоль

public class LengthWord {
    public LengthWord(){
    }
    static Scanner scan = new Scanner(System.in); // Объявляем Scanner

    //*private String array_word[];
    //*private String array_word[] = new String[int quantity]; // Создаём массив String размером в size

    public static void start(Scanner scan) {
        //*int quantity = getInt();

        System.out.println("Введите количество слов: ");
        int quantity = scan.nextInt(); // Вводим с клавиатуры размер массива и записываем в quantity*/
        String array_word[] = new String[quantity]; // Создаём массив String размером в quantity
        for (int i = 0; i < quantity; i++) {
            System.out.printf("Введите слово №%d:\n", i+1);/*Пройдёмся по всему массиву, заполняя его*/
            array_word[i] = scan.next(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.println("Ваш массив: "); /*Выводим на консоль полученный массив слов*/
        System.out.println(Arrays.asList(array_word));
        LengthWord a = new LengthWord(); /*Выводим на консоль значение самого длинного слова и его размер*/
        System.out.println(a.maxLength(array_word));
    }


    public static String maxLength(String[] array_word) {
        String maxWords = "";
        int lengthMaxWord = 0;
        for (int i = 0; i < array_word.length; i++) {
            if (array_word[i].length() > lengthMaxWord) {
                maxWords = array_word[i];
                lengthMaxWord = array_word[i].length();
            } else if (array_word[i].length() == lengthMaxWord) {
                maxWords += ", " + array_word[i];
            }
        }
        System.out.printf("Слово/а с максимальной длинной: %s. Длинна:  %d.\n", maxWords, lengthMaxWord);
        return maxWords;
    }
}
