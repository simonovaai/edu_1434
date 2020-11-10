import java.util.Scanner;
public class Main {
    public static boolean sum(int a, int b) {
        boolean bol = false;
        if (a + b > 10) bol = true;
        return bol;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int num1 = scan.nextInt();
        System.out.print("Введите число 2: ");
        int num2 = scan.nextInt();
        System.out.println(sum(num1, num2));
    }
}
