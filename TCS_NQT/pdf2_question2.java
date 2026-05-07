import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        int arr[] = new int[n];
        for(int i = 0; i <arr.length; i++)  arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int t = sc.nextInt();
        if(t <= 0 || t > n) {
            System.out.println("Invalid Input");
            return;
        }
        int maxdiff = Integer.MIN_VALUE;
        for(int i = 0; i <= n - t; i += t) {
            maxdiff = Math.max(maxdiff, arr[i + t - 1] - arr[i]);
        }
        System.out.println(maxdiff);
    }
}