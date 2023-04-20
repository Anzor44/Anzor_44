package javaCore4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        Phonebook phonebook = new  Phonebook();

        phonebook.add("Иванов", "81111111111");
        phonebook.add("Иванов", "82222222222");
        phonebook.add("Петров", "83333333333");
        phonebook.add("Петров", "84444444444");
        phonebook.add("Иванов", "85555555555");
        phonebook.add("Смирнов", "86666666666");
        phonebook.add("Петров", "87777777777");
        phonebook.add("Сидоров", "88888888888");
        phonebook.add("Смирнов", "89999999999");

        System.out.println(phonebook.get("Смирнов"));
        System.out.println(phonebook.get("Сидоров"));
        System.out.println(phonebook.get("Иванов"));
        System.out.println(phonebook.get("Петров"));
    }
}
