import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        int count = 1;
        int max = 1;
        for (int i=0; i < list.size()-1; i++){
           if (list.get(i) == list.get(i + 1)){
               count++;
               if (max < count) max = count;
            }
            else count=1;
       }
        System.out.println(max);
    }
}
