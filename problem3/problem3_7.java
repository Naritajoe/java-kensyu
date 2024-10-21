package problem3;

public class problem3_7 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10) + 1;
        System.out.println("数値" + a);
        if (a >= 5) {
            System.out.println("5以上です");
        } else {
            System.out.println("5未満です");
        }
    }

}