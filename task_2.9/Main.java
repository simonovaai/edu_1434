/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int [] nums = {1, 3, 5, 9, 13};
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5){
            flag = true;
            break;
            }
        }
        if (flag == true) System.out.println("да");
        else System.out.println("нет");
    }
}
