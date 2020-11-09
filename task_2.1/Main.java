/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static void main(String[] args) {
        String a = "Мама";
        String s = "Мыла";
        String d = "Раму";
        System.out.println(a+s+d);
        System.out.println(a+d+s);
        System.out.println(s+a+d);
        System.out.println(s+d+a);
        System.out.println(d+a+s);
        System.out.println(d+s+a);
    }
}
