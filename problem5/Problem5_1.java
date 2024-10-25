package problem5;

public class Problem5_1 {
    public static void main(String[] args) {
        int[] a = new int[7];
        int i;
        // 整数型配列変数nの成分表示
        for (i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10) + 1;
            System.out.print("a[" + i + "]=" + a[i] + " ");
        }
        System.out.println();
        // 文字列型配列変数nの成分表示

        System.out.println();
    }
}
