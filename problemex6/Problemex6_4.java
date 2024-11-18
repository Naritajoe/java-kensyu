package problemex6;

import java.util.*;

public class Problemex6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // scannerを確実に閉じるにはtry,finallyそして含まれるscanner.close();を追加しなければならない。
        try {

            // scanner.nextLineを使うことでwordを行替えした次の列に挿入できる。
            System.out.print("英単語を入力: ");
            String word = scanner.nextLine();

            // uというHashSetに、wordを文字の配列化したcを追加。
            Set<Character> u = new HashSet<>();

            for (char c : word.toCharArray()) {
                u.add(c);
            }

            // sortedをArraylistに代入して自然順序でsortする。
            List<Character> sorted = new ArrayList<>(u);
            Collections.sort(sorted);

            // 文字列cを表示。
            System.out.print("使用されているアルファベット");
            for (char c : sorted) {
                System.out.print(c + " ");
            }
        } finally {
            scanner.close();
        }
    }
}
