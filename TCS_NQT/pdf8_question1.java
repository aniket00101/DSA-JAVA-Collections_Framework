import java.util.*;
class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 2) System.out.println(100);
        else if(n > 2 && n <= 5) System.out.println(50);
        else if(n > 5) System.out.println(20);
    }
}