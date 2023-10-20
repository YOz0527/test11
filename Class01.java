abstract class Caaa {
    protected int num;

    public Caaa(int n) {
        num = n;
    }

    public abstract void show();
}

class Cbbb extends Caaa {
    public Cbbb(int n) {
        super(n); // 呼叫父類別的建構子，設定 num 值
    }

    public void show() {
        System.out.println("num=" + num);
    }
}

public class Class01 {
    public static void main(String args[]) {
        // 此行可設定 num 成員的值為 2
        Cbbb bb = new Cbbb(2);

        bb.show(); // 此行可印出 "num=2" 字串
    }
}
