import java.util.*;
class Main {
    static int findPartition(int arr[], int low, int high) {
        int pivot = arr[high], i = low - 1, j;
        for(j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[j];
        arr[j] = temp;
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, result;
        int arr[] = new int[n];
        for(i = 0; i < n; i++) arr[i] = sc.nextInt();
        result = findPartition(arr, 0, n - 1);
        System.out.println(result);
    }
}