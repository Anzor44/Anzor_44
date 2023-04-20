package javaCore4;

import java.util.*;

// ������� �1
public class Example {
    public static void main(String[] args){
        String[] words = {"����", "���������", "����� 5W12", "�������", "����", "������", "������", "�����", "����",
                "������", "����", "����", "������", "���������", "�����", "�����", "����", "������", "������"};

        // ������������� ������ HashMap (����:��������)
        Map<String, Integer> map = new HashMap<>();
        for (String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        // ����������� ���������� ��������
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");
    }
}
