package problemex6;

import java.io.*;
import java.util.*;

public class Problemex6_2 {
    public static void main(String[] args) throws IOException {
        // ハッシュマップを作成。クラスにCharacterとStringを追加。
        // 各数字に漢字を割り当てた。
        HashMap<Character, String> n = new HashMap<Character, String>();
        n.put('0', "〇");
        n.put('1', "一");
        n.put('2', "二");
        n.put('3', "三");
        n.put('4', "四");
        n.put('5', "五");
        n.put('6', "六");
        n.put('7', "七");
        n.put('8', "八");
        n.put('9', "九");

        // コンソール内に書き込みと読み取り機能を追加。
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("整数の値を入力してください。");
        String input = br.readLine();

        // 入力が数字以外のものであれば受け取らない。
        if (!input.matches("\\d+"))

        {
            System.out.println("整数の値を入力してください。");
            return;
        }
        // StringBuilderはStringの毎回更新時に新オブジェクトができない版。
        StringBuilder ans = new StringBuilder();

        int count = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            char digit = input.charAt(i);
            ans.insert(0, n.get(digit)); // 漢数字に変換して先頭に挿入
            count++;

            // 3桁ごとにカンマを挿入（ただし最初の桁には挿入しない）
            if (count % 3 == 0 && i != 0) {
                ans.insert(0, ",");
            }
        }

        // 結果を出力
        System.out.println("変換結果:" + ans.toString());
    }
}
