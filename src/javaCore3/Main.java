package javaCore3;

import static javaCore3.Task_2.createApples;
import static javaCore3.Task_2.createOranges;

public class Main {

    public static void main(String[] args) {

        System.out.println("������� � �������� :");
        System.out.println(createApples(10));
        System.out.println(createOranges(3));

        System.out.println("������� :");
        // �������� ������� � ��������
        Box<Apple> appleBox = new Box<>();
        appleBox.add(createApples(10));
        appleBox.add(createApples(6));
        appleBox.add(createApples(3));
        appleBox.add(createApples(8));
        System.out.println(appleBox);
        System.out.println("����� ��� ������� - "+appleBox.getWeight()+"f");
        // �������� ������� � �����������
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(createOranges(10));
        orangeBox.add(createOranges(6));
        orangeBox.add(createOranges(11));
        System.out.println(orangeBox);
        System.out.println("����� ��� ������� - "+orangeBox.getWeight()+"f");

        // ��������� �������
        System.out.println("��������� ������� :");
        if (orangeBox.compare(appleBox)) {
            System.out.println("������� �����");
        } else {
            System.out.println("������� �� �����");
        };
        Box<Apple> appleBoxFull = new Box<>();
        Box<Orange> orangeBoxFull = new Box<>();
        appleBoxFull.add(createApples(3));
        orangeBoxFull.add(createOranges(2));

        System.out.println(appleBoxFull);
        System.out.println(orangeBoxFull);
        if (orangeBoxFull.compare(appleBoxFull)){
            System.out.println("������� �����");
        } else {
            System.out.println("������� �� �����");
        };


        System.out.println("���������� :");

        appleBox.emptyTo(appleBoxFull);
        appleBox.emptyTo(orangeBoxFull);
        System.out.println(appleBox);
        System.out.println(appleBoxFull);

        orangeBox.emptyTo(orangeBoxFull);
        orangeBox.emptyTo(appleBoxFull);
        System.out.println(orangeBox);
        System.out.println(orangeBoxFull);


    }
}
