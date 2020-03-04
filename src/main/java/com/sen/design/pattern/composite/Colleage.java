package com.sen.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 22:46
 * @Description:
 */
public class Colleage extends OrgenizationComponent {

    private List<OrgenizationComponent> components = new ArrayList<>();

    public Colleage(String name, String dec) {
        super(name, dec);
    }

    @Override
    protected void add(OrgenizationComponent component) {
        components.add(component);
    }

    @Override
    protected void remove(OrgenizationComponent component) {
        components.remove(component);
    }

    @Override
    protected void print() {
        System.out.println("-----------"+this.name+"------------");
        for (OrgenizationComponent component : components) {
            component.print();
        }
    }
}
