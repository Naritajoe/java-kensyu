package problem8;

public class Problem8_3 {
    public static void main(String[] args) {
        int n = 3;
        int a = 1;
        for (int i = n; i > 0; i--) {
            a = a * i;
        }
        System.out.println("階乗した結果" + a);
    }
}
