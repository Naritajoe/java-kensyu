package problem6;

public class Minmax {
    // 最大値の取得（3つの数値で）
    public int max(int n1, int n2, int n3) {
        if (n1 > n2 & n1 > n3) {
            ;
            return n1;
        } else if (n1 < n2 & n2 > n3) {
            ;
            return n2;
        }
        return n3;
    }

    // 最小値の取得（3つの数値で）
    public int min(int n1, int n2, int n3) {
        if (n1 < n2 & n1 < n3) {
            ;
            return n1;
        }
        if (n1 > n2 & n2 < n3) {
            ;
            return n2;
        }
        return n3;
    }
}
