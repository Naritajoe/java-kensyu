package samples;

public class P8_9_2ChatGPT {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // 長さ10の配列
        int[] evenNumbers = new int[10]; // 偶数を格納する配列
        int[] oddNumbers = new int[10]; // 奇数を格納する配列
        int evenCount = 0;
        int oddCount = 0;

        // 配列に1から100までのランダムな整数を代入
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }

        // 偶数と奇数に分類して別々の配列に再代入
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers[evenCount++] = num;
            } else {
                oddNumbers[oddCount++] = num;
            }
        }

        // 全ての数を表示
        System.out.print("元の配列：");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 偶数を表示
        System.out.print("偶数：");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // 奇数を表示
        System.out.print("奇数：");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
    }
}
