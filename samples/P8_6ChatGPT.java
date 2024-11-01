package samples;

public class P8_6ChatGPT {

    public static void main(String[] args) {
        // ランダムな分子と分母を生成
        int numerator1 = (int) (Math.random() * 10) + 1; // 分子は1から10の範囲
        int denominator1 = (int) (Math.random() * 9) + 2; // 分母は2から10の範囲
        int numerator2 = (int) (Math.random() * 10) + 1;
        int denominator2 = (int) (Math.random() * 9) + 2;

        // 生成された分数を表示
        System.out.println("Generated fractions: " + numerator1 + "/" + denominator1 + " + " + numerator2 + "/"
                + denominator2);

        // 足し算の処理
        int commonDenominator = denominator1 * denominator2;
        int newNumerator1 = numerator1 * denominator2;
        int newNumerator2 = numerator2 * denominator1;
        int resultNumerator = newNumerator1 + newNumerator2;

        // 結果を約分
        int gcdValue = gcd(resultNumerator, commonDenominator);
        resultNumerator /= gcdValue;
        commonDenominator /= gcdValue;

        // 結果の表示
        if (commonDenominator == 1) {
            // 分母が1の場合、整数として表示
            System.out.println("Result: " + resultNumerator);
        } else {
            // 分数として表示
            System.out.println("Result: " + resultNumerator + "/" + commonDenominator);
        }
    }

    // 最大公約数を再帰的に計算
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
