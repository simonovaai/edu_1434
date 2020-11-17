/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> nums1 = new ArrayList<>();
        for(int i=0; i<=12; i++) {
            nums.add(i);
        }
        //System.out.println(nums);
        for(int i=0; i<=nums.size()-1; i++) {
            if(i>0 && i<10) nums1.add(i);
        }
        System.out.println(nums1);
    }
}
