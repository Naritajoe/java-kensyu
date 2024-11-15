package problemex5;

import java.util.*;

public class Problemex5_1 {
    public static void main(String[] args) {
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        int n;

        while (true) {
            // 1～10の乱数を生成
            n = (int) (Math.random() * 11); // 0から10までの範囲

            System.out.println("0～10の値を出力: " + n);

            // 0の場合にループを終了
            if (n == 0) {
                break;
            }

            // 偶数か奇数を分ける
            if (n % 2 == 0) {
                evens.add(n);
            } else {
                odds.add(n);
            }
        }

        // 偶数と奇数を表示
        System.out.print("偶数 : ");
        for (int even : evens) {
            System.out.print(even + " ");
        }

        System.out.println();

        System.out.print("奇数 : ");
        for (int odd : odds) {
            System.out.print(odd + " ");
        }
    }
}
