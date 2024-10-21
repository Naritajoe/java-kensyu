package problem3;

public class problem3_12 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 20) - 10;
        System.out.println("数値" + a);
        if (a < 0) {
            System.out.println("負の数です");
        } else {
            System.out.println("正の数です");
        }
    }

}