package problem8;

public class Problem8_7 {

    public static void main(String[] args) {
        // 分母と分子を2個ずつ定義
        // 各数値の最大を１０までにする
        int m1 = (int) (Math.random() * 10) + 1;
        int m2 = (int) (Math.random() * 10) + 1;
        int c1 = (int) (Math.random() * 10) + 1;
        int c2 = (int) (Math.random() * 10) + 1;

        System.out.println("問題" + c1 + "/" + m1 + "+" + c2 + "/" + m2);
        // 分母同士を掛け算
        // 対する分母を各分子にかける
        int a1 = c1 * m2;
        int a2 = c2 * m1;
        int m3 = m1 * m2;
        int a3 = a1 + a2;

        int v = gcd(a3, m3);
        a3 /= v;
        m3 /= v;

        System.out.print("答え: ");
        if (a3 % m3 == 0) {
            System.out.println(a3 / m3);
        } else if (a3 > m3) {
            // 帯分数（tbs）と余り（a3）を定義
            int tbs = a3 / m3;
            int a4 = a3 % m3;

            System.out.println("(" + tbs + ") " + a4 + "/" + m3);
        } else {
            System.out.println(a3 + "/" + m3);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }
}
