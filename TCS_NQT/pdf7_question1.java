import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sal = sc.nextInt();
        float result, discount = 0;
        if(sal < 1000)  discount = 0.05f;
        else if(sal >= 1000 && sal < 5000) discount = 0.10f;
        else if(sal >= 5000) discount = 0.15f;
        result = sal - (sal * discount);
        System.out.printf("%.2f", result);
    }
}