package problemex6;

import java.io.*;
import java.util.*;

public class Problemex6_1 {
    public static void main(String[] args) throws IOException {

        HashMap<String, String> map = new HashMap<>();
        map.put("cat", "猫");
        map.put("dog", "犬");
        map.put("bird", "鳥");
        map.put("tiger", "虎");
        map.put("turtle", "亀");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("英語で動物の名前を入力してください：");
        String input = br.readLine();

        if (map.containsKey(input)) {
            System.out.println("「" + map.get(input) + "」です。");
        } else {
            System.out.println("対応するデータは登録されていません。");
        }

    }
}
