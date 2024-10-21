package problem3;

public class problem3_10 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100) + 1;
        System.out.println("数値" + a);
        if (a <= 10 | a >= 90) {
            System.out.println("10以下か90以上の値です");
        } else {
            System.out.println("10より大きく90未満です");
        }
    }

}