/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int d;
        d = a%b;
        if(d!=0) System.out.println("Делится с остатком: "+d);
        else System.out.println("Делится, результат деления: "+(a/b));
    }
}
