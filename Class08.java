interface Data {
    void showData();
}

interface Test {
    void showScore();
    double calcu();
}

class Stu implements Data, Test {
    protected String id;
    protected String name;
    protected int mid;
    protected int finl;
    protected int common;

    public Stu(String id, String name, int mid, int finl, int common) {
        this.id = id;
        this.name = name;
        this.mid = mid;
        this.finl = finl;
        this.common = common;
    }

    public void showData() {
        System.out.println("學號：" + id);
        System.out.println("姓名：" + name);
    }

    public void showScore() {
        System.out.println("期中成績：" + mid);
        System.out.println("期末成績：" + finl);
        System.out.println("平時成績：" + common);
    }

    public double calcu() {
        double totalScore = mid * 0.3 + finl * 0.3 + common * 0.4;
        return totalScore;
    }

    public void show() {
        showData();
        showScore();
        System.out.println("學期成績：" + calcu());
    }
}

public class Class08 {
    public static void main(String[] args) {
        Stu stu = new Stu("940001", "Fiona", 90, 92, 85);
        stu.show();
    }
}
