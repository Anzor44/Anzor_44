package javaCore1;

import javax.swing.*;

public class Team {
    public static void main(String[] args){
        Person[] person = new Person[4];
        person[0] = new Person("Anzor", 355);
        person[1] = new Person("Ovechkin", 250);
        person[2] = new Person("Messi", 400);
        person[3] = new Person("RONALDO", 750);
        Group group = new Group("Команда чемпионов", person);

        Course course = new Course(250,350,410);
        String result = course.doIt(group);
        System.out.println(result);
    }
}
