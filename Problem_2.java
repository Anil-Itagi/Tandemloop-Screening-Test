import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        int num = 1;
        for (int i = 0; i < a; i++) {
            System.out.print(num + (i < a - 1 ? ", " : ""));
            num += 2;
        }
    }
}
