package problemex6;

import java.util.*;

public class Problemex6_3 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> rNumbers = new ArrayList<>();
        Set<Integer> uNumbers = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(10) + 1;
            rNumbers.add(n);
            uNumbers.add(n);
        }
        System.out.print("乱数: ");
        for (int n : rNumbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.print("出現した数: ");
        for (int n : uNumbers) {
            System.out.print(n + " ");
        }
    }
}
