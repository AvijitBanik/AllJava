final class Number {
    //////////PRIVATE FIELD///////////////
    private final float number;

    //////////PUBLIC FIELD////////////////
    //////////CONSTRUCTOR/////////////////
    public Number(float num) {
        this.number = num;
    }

    public Number add(float num) {
        Number n;
        n = new Number(num + getNumber());
        return n;
    }
    public Number subtract(float num) {
        Number n;
        n = new Number(getNumber() - num);
        return n;
    }
    public Number multiply(float num) {
        Number n;
        n = new Number(num * getNumber());
        return n;
    }
    public Number divide(float num) {
        Number n;
        n = new Number(getNumber() / num);
        return n;
    }
    public float getNumber() {
        return number;
    }
}

public class MathOp {
    public static void main(String[] args){
        Number numberA = new Number(10);
        Number numberB = numberA.add(30);
        Number numberC = numberA.add(numberB.getNumber()).divide(5);
        System.out.print("The Answer is " + numberC.getNumber() +"\n");

    }

}
