package problem8;

public class Problem8_11 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] dual = new int[10];
        int[] semi = new int[10];
        int dualC = 0;
        int semiC = 0;

        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 10) + 1;
            b[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.print("配列1: ");
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.print("配列2: ");
        for (int n : b) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            boolean inA = false;
            boolean inB = false;

            for (int j = 0; j < 10; j++) {
                if (a[j] == i) {
                    inA = true;
                    break;
                }
            }

            for (int j = 0; j < 10; j++) {
                if (b[j] == i) {
                    inB = true;
                    break;
                }
            }
            if (inA && inB) {
                dual[dualC++] = i;
            }
            if (inA || inB) {
                semi[semiC++] = i;
            }
        }
        System.out.print("共通の数：");
        for (int i = 0; i < dualC; i++) {
            System.out.print(dual[i] + " ");
        }
        System.out.println();

        System.out.print("どちらかに入っている数");
        for (int i = 0; i < semiC; i++) {
            System.out.print(semi[i] + " ");
        }
    }
}
