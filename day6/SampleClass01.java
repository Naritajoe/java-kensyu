package day6;

public class SampleClass01 {
    // フィールド
    int n = 10;
    String s = "field";

    String add(String s) {
        return this.s + s;
    }

    // メソッド
    int add(int a, int b) {
        return a + b;
    }

    void showNum() {
        System.out.println("n = " + n);
    }
}