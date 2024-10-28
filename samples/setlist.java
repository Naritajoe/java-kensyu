package samples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setlist {
    public static void main(String[] args) {
        List<List<Integer>> uniqueTriplets = new ArrayList<>();
        Set<String> seenResults = new HashSet<>();

        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                for (int c = 1; c <= 100; c++) {
                    if (a * a + b * b == c * c) {
                        // 計算結果に対するユニークなキーを作成（例えば"a^2 + b^2"のような文字列）
                        String resultKey = Math.min(a, b) + "," + Math.max(a, b) + "," + c;

                        // 既に同じ結果があるか確認
                        if (!seenResults.contains(resultKey)) {
                            List<Integer> triplet = List.of(a, b, c);
                            uniqueTriplets.add(triplet); // 重複がない場合のみ追加
                            seenResults.add(resultKey); // 計算結果を記録
                        }
                    }
                }
            }
        }

        // 結果を表示
        for (List<Integer> triplet : uniqueTriplets) {
            System.out.println(triplet);
        }
        System.out.println("Total unique combinations: " + uniqueTriplets.size());
    }
}