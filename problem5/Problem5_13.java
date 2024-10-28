package problem5;

public class Problem5_13 {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int m, n;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // 二次元配列に値を代入
        for (m = 0; m < a.length; m++) {
            for (n = 0; n < a[m].length; n++) {
                a[m][n] = (int) (Math.random() * 9) + 1;

                if (a[m][n] > max) {
                    max = a[m][n];
                }
                if (a[m][n] < min) {
                    min = a[m][n];
                }
            }

        }

        // 成分の表示
        for (m = 0; m < a.length; m++) {
            for (n = 0; n < a[m].length; n++) {
                System.out.print(a[m][n] + " ");
            }
            System.out.println();
        }
        System.out.println("最大値" + max);
        System.out.println("最小値" + min);
    }
}
