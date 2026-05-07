import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        double time = sc.nextDouble();
        if(time <= 0 || time > 60) {
            System.out.println("Error");
            return;
        }
        time = time / 60.0;
        System.out.println((int)(distance / time));
    }
}