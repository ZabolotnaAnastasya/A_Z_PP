import java.util.Scanner;
import java.util.ArrayList;

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

        //динамічний лист
        ArrayList<Fibo_num> specialNumbers = generate_fibo(n);

        System.out.println("\nЧисла Фібоначчі, що дорівнюють w*w - 1:");
        if (specialNumbers.isEmpty()) {
            System.out.println("На цьому проміжку нема таких чисел.");
        } else {
            print_list(specialNumbers);
        }

    }

    static ArrayList<Fibo_num> generate_fibo(int n) {
        ArrayList<Fibo_num> result = new ArrayList<>();
        long a = 1,b = 1, c; //перші 2 числа після віднімання 1 дають 0, що не є квадратом числа фібоначі
        int num = 3;

        n +=3; //бо лік іде від числа а, а задаєм число фібоначі числоб с = а + 3
        for (int i = 3; i <= n; i++) {
            c = a + b;
            Fibo_num fibo = new Fibo_num(i, c);
            if (fibo.chek_w2_1()){
                result.add(fibo);
            }
            a = b;
            b = c;
        }
        return result;
    }



    static void print_list(ArrayList<Fibo_num> arr) {
        for (Fibo_num fibo : arr) {
            fibo.print();
        }
    }
}
