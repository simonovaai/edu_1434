/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        Map map = new HashMap();
        while (true) {
            String city = scanner.nextLine();
            if (city.isEmpty()) break;
            String family = scanner.nextLine();
            map.put(city,family);
        }
        String currentcity = scanner.nextLine();
        System.out.println(map.get(currentcity));
    }
}
