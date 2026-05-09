import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, result = Integer.MAX_VALUE;
        int arr[] = new int[n];
        int arr2[][] = new int[n][n];
        for(i = 0; i < n; i++) arr[i] = sc.nextInt();
        for(i = 0; i < n; i++) 
            for(j = 0; j < n; j++) 
                arr2[i][j] = sc.nextInt();
        for(i = 0; i < n; i++) {
            int sum = 0;
            for(j = 0; j < n; j++) {
                if(i==j) sum += arr[i];
                else    sum += arr2[i][j];
            }
            result = Math.min(result, sum);
        }
        System.out.println(result);
    }
}