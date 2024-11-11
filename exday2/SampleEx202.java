package exday2;

public class SampleEx202 {
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Car c = new Car();
        System.out.println(c.toString());
        System.out.println(c.getClass());
        Ambulance a = new Ambulance();
        Object o = (Object) a;
        System.out.println(o.toString());
        System.out.println(o.getClass());
    }
}
