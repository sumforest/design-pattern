package com.sen.design.pattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 19:36
 * @Description:
 */
public class ObjectStructure {
    List<Person> persons = new LinkedList<>();

    public void attach(Person person) {
        persons.add(person);
    }

    public void remove(Person person) {
        persons.remove(person);
    }

    public void show(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
