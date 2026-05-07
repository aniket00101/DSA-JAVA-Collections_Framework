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
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            st.add(arr[i]);
        }
        ArrayList<Integer> res = new ArrayList<>(st);
        for(int i = res.size() - 1; i >= 0; i--)
            System.out.print(res.get(i) + " ");
    }
}