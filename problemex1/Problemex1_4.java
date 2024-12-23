package problemex1;

public class Problemex1_4 {
    public static void main(String[] args) {
        Counter c1, c2;
        c1 = new Counter();
        c2 = new Counter();
        c1.count();
        c2.count();
        c2.count();
        c2.reset();
        c1.count();
        c1.count();
        c2.count();
        int totalCount = getTotalCount(c1.getCount(), c2.getCount());
        System.out.println("c1のカウント数：" + c1.getCount());
        System.out.println("c2のカウント数：" + c2.getCount());
        System.out.println("トータルのカウント数:" + totalCount);
    }

    static int getTotalCount(int c1, int c2) {
        return c1 + c2;
    }
}
