package exday3;

public class SampleClassEx302 {
    public static void main(String args[]) {
        Crow2 c = new Crow2();
        Sparrow2 s = new Sparrow2();
        Pigeon p = new Pigeon();
        // カラスがなく
        System.out.print(c.getName() + " : ");
        c.sing();
        // 雀がなく
        System.out.print(s.getName() + " : ");
        s.sing();
        // 鳩がなく
        System.out.print(p.getName() + "   : ");
        p.sing();
    }
}
