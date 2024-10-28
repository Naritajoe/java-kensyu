package problem7;

public class Calculation {
    // 文字列
    private int n1 = 0;
    private int n2 = 0;

    // n1のセッター
    public void setNumber1(int n1) {
        this.n1 = n1;
    }

    // n1のゲッター
    public int getNumber1() {
        return this.n1;
    }

    // n2のセッター
    public void setNumber2(int n2) {
        this.n2 = n2;
    }

    // n2のゲッター
    public int getNumber2() {
        return this.n2;
    }

    // 加算を取得
    public int add() {
        return n1 + n2;
    }

    // 減算を取得
    public int sub() {
        return n1 - n2;
    }

}
