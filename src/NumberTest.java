class Number {
    ///////////PRIVATE FIELD/////////
    private float number;

    ///////////PUBLIC FIELD//////////
    public Number(float num){  //CONSTRUCTOR
        this.number = num;
    }
    public Number add(Number num) { //ADD METHOD
        this.number += num.number;
        return this;
    }
    public Number subtract(Number num){   //Subtract METHOD
        this.number -= num.number;
        return this;
    }
    public Number time(Number num){   //Multiply METHOD
        this.number *= num.number;
        return this;
    }
    public Number divide(Number num){   //DIVIDE METHOD
        this.number /= num.number;
        return this;
    }

    public void setNumber(float num) {
        this.number = num;
    }
    public float getNumber() {  //getter
        return this.number;
    }
}

public class NumberTest {

    public static void main(String[] args) {
        Number numberA = new Number(50);
        Number numberB = new Number(10);
        Number numberC = new Number(3);

        Number result1 = numberA.add(numberB).divide(numberC);

        System.out.println("The First Result is\t" + result1.getNumber());

        //////////////////////////////////////////////

        numberA.setNumber(-4845);
        numberB.setNumber(2023);
        numberC.setNumber(105);

        Number result2 = numberA.time(numberC).subtract(numberB).add(new Number(46));

        System.out.println("The Last Result is\t" + result2.getNumber());

    }
}
