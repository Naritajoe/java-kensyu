package problem5;

public class Problem5_7 {
    public static void main(String[] args) {
        int[] d = new int[5];

        System.out.print("");
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * 10) + 1;
            System.out.print(" " + d[i]);

        }
        System.out.println(" ");

        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];

        }
        int avr = (sum) / d.length;
        System.out.println("合計値:" + sum);
        System.out.println("平均値:" + avr);

        System.out.print("平均値より大きい数:");

        for (int i = 0; i < d.length; i++) {
            if (d[i] >= avr) {
                System.out.print(d[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("平均値より小さい数:");

        for (int i = 0; i < d.length; i++) {
            if (d[i] <= avr) {
                System.out.print(d[i] + " ");
            }
        }
    }
}
