package problem8;

public class Problem8_4 {

    public static void main(String[] args) {

        {
            int a = (int) (Math.random() * 1000) + 1;
            System.out.println(a);

            if (a > 9) {
                if (a > 99) {
                    if (a > 999) {
                        if (a == 1000) {
                            System.out.println("4桁の数値");
                        }
                    } else {
                        System.out.println("3桁の数値");
                    }
                } else {
                    System.out.println("2桁の数値");
                }
            } else {
                System.out.println("1桁の数値");
            }

        }

    }

}
