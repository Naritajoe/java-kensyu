package problemex5;

import java.util.*;

public class Problemex5_7 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        int n;

        while (true) {
            n = (int) (Math.random() * 11);
            System.out.println("0~10の値を出力: " + n);

            if (n == 0) {
                break;
            }

            // insertIndexはリストのどこに数値を入れるか決める役割を持つ。
            // 1つずつ検証を繰り返して以上、未満の間になる箇所を探す。
            int insertIndex = 0;
            while (insertIndex < a.size() && a.get(insertIndex) < n) {
                insertIndex++;
            }
            a.add(insertIndex, n);

            System.out.print("");
            for (int data : a) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
}
