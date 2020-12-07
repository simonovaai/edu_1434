/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int [] nums = {1, 3, 5, 9, 9};
        boolean flag = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]){
                flag = true;
                break;
            }
        }
        if (flag == true) System.out.println("да");
        else System.out.println("нет");
    }
}
