package javaCore4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        Phonebook phonebook = new  Phonebook();

        phonebook.add("������", "81111111111");
        phonebook.add("������", "82222222222");
        phonebook.add("������", "83333333333");
        phonebook.add("������", "84444444444");
        phonebook.add("������", "85555555555");
        phonebook.add("�������", "86666666666");
        phonebook.add("������", "87777777777");
        phonebook.add("�������", "88888888888");
        phonebook.add("�������", "89999999999");

        System.out.println(phonebook.get("�������"));
        System.out.println(phonebook.get("�������"));
        System.out.println(phonebook.get("������"));
        System.out.println(phonebook.get("������"));
    }
}
