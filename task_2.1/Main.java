public class Main {
    public static void main(String[] args) {
        String[] arr = {"Мама", "Мыла", "Раму"};
            int counter;
            int time;
            String a;
            String b;
            for (int i=0;i<3;i++) {
                counter = 0;
                do {
                    a = b = arr[i];
                    time=0;
                    for (int j = 0; j < 3; j++) {
                        if (i != j) {
                            a = a + arr[j];
                                for (int k = 0; k < 3; k++) {
                                    if (i != k && j != k) b = b + arr[k];
                           }
                        }
                    }
                    System.out.println(a+" ");
                    System.out.println(b+" ");
                    counter++;
                } while (counter == arr.length);
            }
        }
    }
