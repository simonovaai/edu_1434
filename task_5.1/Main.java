/*
 * Дана коллекция имён.
 * 1) удалить все повторяющиеся имена из коллекции
 * 2) вывести коллекцию на экран
 * */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");
        System.out.println("Duplicates List: "+names);
        Object[] check = names.toArray();
        for (Object i: check) {
            if (names.indexOf(i) != names.lastIndexOf(i)) {
                names.remove(names.lastIndexOf(i));
            }
        }
        System.out.println("Result: "+names);
    }
}
