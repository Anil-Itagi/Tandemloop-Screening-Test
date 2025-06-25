import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a * 2; i += 2) {
            if (i <= a * 2 - 1 && i <= a * 2 - 1) {
                System.out.print(i + " ");
            }
            if ((i + 2) / 2 > a) break; // Limit based on examples
        }
    }
}
