package problemex2;

public class NewCalc extends FundCalc {

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    // 二つ目の数を設定
    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    // フィールドnumber1、number2の積
    public double mul() {
        return number1 * number2;
    }

    // フィールドnumber1、number2の商
    public double div() {
        return number1 / number2;
    }
}
