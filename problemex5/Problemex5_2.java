package problemex5;

import java.util.*;

public class Problemex5_2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        int n;

        while (true) {
            n = (int) (Math.random() * 11);
            System.out.println("0~10の値を入力:" + n);

            if (n == 0) {
                break;
            }

            a.add(n);
            // 以下はaが蓄積されているのか確認する方法
            // for (int i = 0; i < 1; i++) {
            // System.out.println(a);
            // }
        }

        Collections.reverse(a);
        for (int number : a) {
            System.out.print(number + " ");
        }

    }
}
