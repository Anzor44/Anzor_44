package javaCore3;

public class Apple extends Fruit {
    public Apple(int count){
        super(count);
        this.weightOfFruits = 1.0;
    }

    @Override
    public String toString() {
        return "������� � �������� {" + count + " ����, ����� " + getWeight() + "f}";
    }
}
