import java.util.*;
import java.math.BigInteger;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int end = sc.nextInt();
        BigInteger same, diff;
        BigInteger R1 = BigInteger.valueOf(R - 1); 
        BigInteger R2 = BigInteger.valueOf(R - 2); 
        if (end == 1) {
            same = BigInteger.ONE; 
            diff = BigInteger.ZERO;
        } else {
            same = BigInteger.ZERO;
            diff = BigInteger.ONE; 
        }
        for (int i = 2; i <= N; i++) {
            BigInteger newSame = diff;
            BigInteger newDiff = same.multiply(R1).add(diff.multiply(R2));
            same = newSame;
            diff = newDiff;
        }
        System.out.println(same);
    }
}