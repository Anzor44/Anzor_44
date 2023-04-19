package javaCore3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> list = new ArrayList<>(); // ������� � �������� ������ ����

    public Box(){
    }

    @Override
    public String toString(){
        return "������� {" + list + "}";
    }

    public void add(T value){
        this.list.add(value);
    }

    public Double getWeight(){
        Double result = 0.0;
        for (T i: list) {
            result+=i.getWeight();
        }
        return result;
    }

    public boolean compare(Box box) {      //��������� �������
        boolean result = false;
        Double Weight = this.getWeight();
        Double boxWeight = box.getWeight();
        if (Weight.equals(boxWeight)) {
            result = true;
        }
        return result;
    }

    public void emptyTo(Box box) {        //����������� ������� � �������
        for (T i : this.list) {
            box.add(i);
        }
        this.list.clear();       //��������� ������� �� ������� ���� ������
    }
}
