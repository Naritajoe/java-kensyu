package problemex1;

public class Problemex1_3 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10) + 1; // 1～10の乱数を発生
        int b = (int) (Math.random() * 10) + 1; // 1～10の乱数を発生
        // 二つの数の積を求める
        System.out.println("たて : " + a);
        System.out.println("よこ : " + b);
        square(a, b);
    }

    // 掛け算
    static void square(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("■ ");
            }
            System.out.println();
        }
    }
}
