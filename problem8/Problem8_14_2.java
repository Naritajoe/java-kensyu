package problem8;

public class Problem8_14_2 {
    public static void main(String[] args) {

        boolean[] locker = new boolean[50];
        System.out.print("初期値：");
        for (int i = 0; i < 50; i++) {
            locker[i] = false;
            System.out.print(locker[i] + " ");
        }
        System.out.println();
        for (int n = 1; n <= 50; n++) {
            System.out.print(n + "番目の生徒の行動：");
            for (int i = 0; i < 50; i++) {
                if (i % n == 0 && locker[i] == false) {
                    locker[i] = true;
                } else if (i % n == 0 && locker[i] == true) {
                    locker[i] = false;
                }
                System.out.print(locker[i] + " ");
            }
            System.out.println();
        }
    }
}
