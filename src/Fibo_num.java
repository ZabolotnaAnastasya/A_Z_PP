
public class Fibo_num {
    long n;
    long val;

    public Fibo_num(long n, long val) {    // конструктор
        this.n = n;
        this.val = val;
    }

    public boolean chek_w2_1() {
        int root = (int) Math.sqrt(this.val + 1);
        return (root * root) == (this.val + 1);
    }

    // гетери і сетери
    public long getN() { return n; }
    public long getVal() { return val; }

    public void print() {
        System.out.println(this.n + " число по порядку, зі значенням " + this.val);
    }
}
