final class Number {
    //////////PRIVATE FIELD///////////////
    private final float number;

    //////////PUBLIC FIELD////////////////
    //////////CONSTRUCTOR/////////////////
    public Number(float num) {
        this.number = num;
    }

    public Number add(Number num) {
        Number n;
        n = new Number(this.getNumber() + num.getNumber());
        return n;
    }
    public Number subtract(Number num) {
        Number n;
        n = new Number(this.getNumber() - num.getNumber());
        return n;
    }
    public Number multiply(Number num) {
        Number n;
        n = new Number(this.getNumber() * num.getNumber());
        return n;
    }
    public Number divide(Number num) {
        Number n;
        n = new Number(this.getNumber() / num.getNumber());
        return n;
    }
    public float getNumber() {
        return number;
    }
}

public class MathOp {
    public static void main(String[] args){
        Number numberA = new Number(10);
        Number numberB = numberA.add(new Number(30));
        Number numberC = numberA.add(numberB).divide(new Number(5));
        System.out.print("The Answer is " + numberC.getNumber() +"\n");

    }

}
