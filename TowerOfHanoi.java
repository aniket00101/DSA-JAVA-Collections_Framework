import java.util.Scanner;

class TowerOfHanoi {

    // Recursive function
    static void toh(int n, char source, char auxiliary, char destination) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary
        toh(n - 1, source, destination, auxiliary);

        // Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from auxiliary to destination
        toh(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        toh(n, 'A', 'B', 'C');
    }
}
