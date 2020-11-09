/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time;
        System.out.print("Введите сумму вклада: ");
        int vklad = scan.nextInt();
        System.out.print("Введите годовой процент: ");
        int procent = scan.nextInt();
        for (var i = 1; i <= 5; i++)
        {
            vklad = vklad + (vklad * procent/100);
            System.out.println("Через "+i+"-ый год на вашем счету будет: "+vklad);
        }
    }
}
