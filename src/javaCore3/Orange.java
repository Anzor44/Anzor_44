package javaCore3;

public class Orange extends Fruit {   // ���������
    public Orange(int count){
        super(count);
        this.weightOfFruits = 1.5;
    }

    @Override
    public String toString(){
        return "������� � ����������� {" + count + " ����, ����� "+getWeight()+ "f}";
    }
}
