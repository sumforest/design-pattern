package com.sen.design.pattern.composite;

/**
 * @Auther: Sen
 * @Date: 2019/11/15 22:52
 * @Description: 組合聚合模式
 */
public class Client {

    public static void main(String[] args) {
        OrgenizationComponent university = new University("清华大学", "中国顶级学府");

        OrgenizationComponent colleage1 = new Colleage("计算机学院", "王牌学院");
        OrgenizationComponent colleage3 = new Colleage("生物学院", "老牌学院");

        OrgenizationComponent  department1 = new Department("Java", "Java");
        OrgenizationComponent  department2 = new Department("c", "c");
        OrgenizationComponent  department3 = new Department("go", "go");
        colleage1.add(department1);
        colleage1.add(department2);
        colleage1.add(department3);

        OrgenizationComponent  department4 = new Department("生物工程", "生物工程");
        OrgenizationComponent  department5= new Department("基因测序", "基因测序");
        OrgenizationComponent  department6 = new Department("现在医学", "现在医学");
        colleage3.add(department4);
        colleage3.add(department5);
        colleage3.add(department6);

        university.add(colleage1);
        university.add(colleage3);

        university.print();
    }
}
