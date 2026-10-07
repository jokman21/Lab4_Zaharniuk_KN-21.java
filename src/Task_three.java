import java.util.Scanner;

public class Task_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean xz = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    xz = false;
                    break;
                }
            }
            if (xz) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}