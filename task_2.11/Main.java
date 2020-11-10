public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ind = 0;
        sum(arr, ind);
    }
    static int sum(int arr[], int ind){
        int sum = 0;
        for (int i = 0 ; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(arr[i]);
            ind = arr[i];
            if (sum > 10) break;
        }
        return ind;
    }
}
