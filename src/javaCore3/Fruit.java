package javaCore3;

abstract class Fruit {
    double weightOfFruits;
    int count;

    public Fruit(int value){

        this.count = value;
    }

    public Double getWeight(){       // �������� ����� ��� �������
        double result = this.count*this.weightOfFruits;
        return result;
            }
}
