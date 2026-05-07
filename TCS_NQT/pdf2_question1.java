import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        if(r <= 0 || c <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        int i, j;
        int arr[][] = new int[r][c];
        for(i = 0; i < r; i++)
            for(j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt();
        if(a < 0 || b < 0 || a >= r || b >= r) {
            System.out.println("Invalid Input");
            return;
        } else {
            System.out.println(arr[a][0] + arr[a][1]);
            return;
        }
        
    }
}