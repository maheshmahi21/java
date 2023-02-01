import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            index[i] =i;

        }
//        bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
//                    swap the elemnts
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    int tempIndex = index[j];
                    index[j] = index[j + 1];
                    index[j + 1] = tempIndex;

                }
            }
        }
        for (int i = 0; i <n; i++) {
            System.out.println(index[i] + " ");
        }

    }
}
