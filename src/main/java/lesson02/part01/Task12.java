package lesson02.part01;

/**
 * Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
 * Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
 * МылаРамуМама
 * РамуМамаМыла
 * ...
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Выведенный текст должен содержать 6 строк.
 * 3.	Текст в каждой строке должен быть уникален.
 * 4.	Должны быть выведены все возможные комбинации.
 */

public class Task12 {
    public static void main(String[] args) {
        String word1 = "Мама";
        String word2 = "Мыла";
        String word3 = "Раму";
        System.out.println(word1 + word2 + word3);
        System.out.println(word1 + word3 + word2);
        System.out.println(word2 + word1 + word3);
        System.out.println(word2 + word3 + word1);
        System.out.println(word3 + word1 + word2);
        System.out.println(word3 + word2 + word1);
    }
}
