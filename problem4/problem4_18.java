package problem4;

public class problem4_18 {

    public static void main(String[] args) {
        // forの二重ループ
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == i) {
                    System.out.print("■");
                } else {
                    System.out.print("□");
                }
            }
            System.out.println();
        }
    }

}
