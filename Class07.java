interface MyMath {
    void show();
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}

interface AdvancedMath {
    void mod(int a, int b);
    void fac(int a);
    void pow(int a, int b);
}

class Compute implements MyMath, AdvancedMath {
    private int ans;

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

    public void mod(int a, int b) {
        ans = a % b;
    }

    public void fac(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        ans = factorial;
    }

    public void pow(int a, int b) {
        ans = (int) Math.pow(a, b);
    }

    public void show() {
        System.out.println("ans=" + ans);
    }
}

public class Class07 {
    public static void main(String[] args) {
        Compute cp = new Compute();
        
        cp.mul(3, 5);
        cp.show(); // 顯示 "ans=15" 字串

        cp.mod(14, 5);
        cp.show(); // 顯示 "ans=4" 字串

        cp.fac(5);
        cp.show(); // 顯示 "ans=120" 字串
    }
}
