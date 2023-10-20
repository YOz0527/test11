// Ex11_2,抽象類別
abstract class MyMath {
    protected int ans;

    public void show() {
        System.out.println("ans=" + ans);
    }

    public abstract void add(int a, int b);

    public abstract void sub(int a, int b);

    public abstract void mul(int a, int b);

    public abstract void div(int a, int b);
}

class Compute extends MyMath {
    public void add(int a, int b) {
        ans = a + b;
    }

    public void sub(int a, int b) {
        ans = a - b;
    }

    public void mul(int a, int b) {
        ans = a * b;
    }

    public void div(int a, int b) {
        if (b != 0) {
            ans = a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class Class02 {
    public static void main(String args[]) {
        Compute cp = new Compute();

        cp.mul(3, 5); // 8 + 3 * 5
        cp.show(); // 顯示 "ans=15" 字串
    }
}
