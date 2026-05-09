import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        int maxfreq = 0, result = -1;
        for(Map.Entry<Integer, Integer> entry: mp.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if(val > maxfreq) {
                maxfreq = val;
                result = key;
            } else if( maxfreq == val) {
                result = Math.min(result, key);
            }
        }
        System.out.println(result);
    }
}