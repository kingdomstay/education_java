package lesson02.part01;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три имени, вывести на экран надпись:
 * name1 + name2 + name3 = Чистая любовь, да-да!
 * Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Программа должна считывать данные с клавиатуры.
 * 3.	Выведенный текст должен содержать введенное имя name1.
 * 4.	Выведенный текст должен содержать введенное имя name2.
 * 5.	Выведенный текст должен содержать введенное имя name3.
 * 6.	Выведенный тест должен полностью соответствовать заданию.
 */

public class Task20 {
    public static void main(String[] args) throws Exception {
        String name1;
        String name2;
        String name3;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        name1 = scanner1.nextLine();
        name2 = scanner2.nextLine();
        name3 = scanner3.nextLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}