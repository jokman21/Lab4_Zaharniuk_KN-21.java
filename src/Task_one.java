import java.util.Scanner;

public class Task_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        double x = sc.nextDouble();
        double y;

        // y = x^2, x < 0
        // y = 0,   x = 0
        // y = 2x,  0 < x <= 10
        // y = x-10, x > 10
        if (x < 0) {
            y = x * x;
        } else if (x == 0) {
            y = 0;
        } else {
            if (x <= 10) {
                y = 2 * x;
            } else {
                y = x - 10;
            }
        }

        System.out.println("y = " + y);
    }
}