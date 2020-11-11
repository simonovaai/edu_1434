public class Main {
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65};
        int n;
        n = 0;
        System.out.println(elem(num, n));
    }
    public static int elem (int[] numbers, int n){
        int a;
        a = numbers.length;
        int b;
        b = numbers[n];
        if (n >= 0 && n < numbers.length-1){
        n++;
        System.out.println(b);
        return elem(numbers, n);
        }
        else return b;
    }
}
