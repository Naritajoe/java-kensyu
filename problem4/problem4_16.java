package problem4;

public class problem4_16 {

    public static void main(String[] args) {
        // forの二重ループ
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int k = i * j;
                System.out.print(i + "*" + j + "=" + k + " ");
            }
            System.out.println();
        }
    }

}
