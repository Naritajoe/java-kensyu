package problem5;

public class Problem5_8 {
    public static void main(String[] args) {
        int[] d = new int[5];

        System.out.print("");
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * 20) - 11;
            System.out.print(" " + d[i]);

        }
        System.out.println(" ");

        System.out.print("0より大きい数:");
        int m = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] > m) {
                m++;
            }
        }
        System.out.print(m);

        System.out.println("");
        System.out.print("0より小さい数:");
        int n = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] < n) {
                n++;
            }
        }
        System.out.print(n);

        System.out.println("");
        System.out.print("0の個数:");
        int z = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 0) {
                z++;
            }
        }
        System.out.print(z);
    }
}
