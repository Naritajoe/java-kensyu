package problem8;

public class Problem8_8 {

    // 数値の定義
    public static void main(String[] args) {
        int n = (int) (Math.random() * 1000) + 1;
        System.out.println("n= " + n);
        // 約数を小さい順に表記。１から全ての数値をチェック。
        for (int i = 1; i <= n; i++) {
            // 一番大きい数と位置した時は最後だからコンマなし。
            if (n % i == 0 && i == n) {
                System.out.print(i);
                // その他の約数はコンマつける。
            } else if (n % i == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
