package problem8;

public class Problem8_12_2 {
    public static void main(String[] args) {

        // 2から１００までの乱数を定義。最小の素数２をsで定義。
        int a = (int) (Math.random() * 99) + 2;
        int s = 2;

        System.out.println("元の数値： " + a);

        System.out.print("素因数分解： " + a + " = ");
        boolean s1 = true;

        // 数値が１以上の場合
        while (a > 1) {
            // かつ数値を素数で割り切れる場合
            while (a % s == 0) {
                // １つめの素数がTrueの場合「×」ははいらないから、冒頭のみ付けるために「！s１」を表記。
                if (!s1) {
                    System.out.print(" × ");
                }
                // 素因数の表記。s１がfalseになっているからこれ以降毎度「×」が表示される。
                // 表記後、aの数値はsで除算した結果が代入される。
                System.out.print(s);
                a /= s;
                s1 = false;
            }
            // sの数値が１上がる。
            s++;
        }
        System.out.println();
    }
}
