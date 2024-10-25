package problem5;

public class Problem5_6 {
    public static void main(String[] args) {
        int[] d = new int[10];

        System.out.print("");
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * 10) + 1;
            System.out.print(" " + d[i]);

        }
        System.out.println(" ");

        int max = d[0];
        for (int i = 1; i < d.length; i++) {
            if (d[i] > max) {
                max = d[i];
            }
        }
        System.out.print("最大値:" + max);

        System.out.println(" ");

        int min = d[0];
        for (int i = 1; i < d.length; i++) {
            if (d[i] < min) {
                min = d[i];
            }
        }
        System.out.print("最小値:" + min);

        System.out.println(" ");

        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];

        }
        int avr = (sum) / d.length;
        System.out.print("平均値:" + avr);
    }
}
