import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);
        int n;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);  // для командного рядка
        } else {
            System.out.println("Введіть кількість N: ");
            n = ans.nextInt();               //для вводу
        }

        checkSquares(n);
    }

    static void checkSquares(int n) {
        int rule = 1;
        int a = 1, b = 1, c;

        for (int i = 0; i < n; ) {
            c = a + b;
            if (c == rule * rule - 1) {
                Fibo_num first_fibo = new Fibo_num(i + 3, c);
                first_fibo.print();
            }
            if (c > rule * rule - 1) {
                rule++;
                continue;
            }
            a = b;
            b = c;
            i++;
        }
    }

}
