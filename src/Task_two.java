import java.util.Scanner;

public class Task_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        // while
        int a = n;
        long r1 = 0;
        while (a > 0) {
            r1 = r1 * 10 + a % 10;
            a = a / 10;
        }
        System.out.printf("while:    %010d%n", r1);

        // do-while
        int b = n;
        long r2 = 0;
        do {
            r2 = r2 * 10 + b % 10;
            b = b / 10;
        } while (b > 0);
        System.out.printf("do-while: %010d%n", r2);
    }
}