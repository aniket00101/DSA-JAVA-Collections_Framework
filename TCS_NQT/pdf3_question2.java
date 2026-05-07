import java.util.*;
class Main {
    static int findminindex(int arr[]) {
        int minindex = 0;
        for(int i = 1; i < arr.length; i++) 
            if(arr[i] < arr[minindex])  
                minindex = i;
        return minindex;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)  arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int minindex = findminindex(arr);
        int rot = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == k){
                rot = i;
            }
        }
        if(rot == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println(minindex);
            System.out.println((rot - minindex + n) % n);
        }
    }
}