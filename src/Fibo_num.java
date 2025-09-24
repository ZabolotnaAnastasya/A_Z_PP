
public class Fibo_num {
    int n;
    int val;

    public Fibo_num(int n, int val) {    // конструктор
        this.n = n;
        this.val = val;
    }

    // гетери і сетери
    public int getN() { return n; }
    public int getVal() { return val; }

    public void print() {
        System.out.println(this.n + " число по порядку, зі значенням " + this.val);
    }
}
