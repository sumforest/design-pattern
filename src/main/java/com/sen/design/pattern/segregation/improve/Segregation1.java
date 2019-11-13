package com.sen.design.pattern.segregation.improve;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 00:23
 * @Description: 接口隔离原则(对不需要的接口方法进行拆分)
 */
public class Segregation1 {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
    void method3();
}

interface Interface3 {
    void method4();
    void method5();
}

class B implements Interface1,Interface2 {

    @Override
    public void method1() {
        System.out.println("B 实现了method1");
    }

    @Override
    public void method2() {
        System.out.println("B 实现了method2");
    }

    @Override
    public void method3() {
        System.out.println("B 实现了method3");
    }
}

class D implements Interface1,Interface3{
    @Override
    public void method1() {
        System.out.println("D 实现了method1");
    }

    @Override
    public void method4() {
        System.out.println("D 实现了method4");
    }

    @Override
    public void method5() {
        System.out.println("D 实现了method5");
    }
}

class A{
    public void depend1(Interface1 interface1) {
        interface1.method1();
    }
    public void depend2(Interface2 interface1) {
        interface1.method2();
    }
    public void depend3(Interface2 interface1) {
        interface1.method3();
    }
}

class C{
    public void depend1(Interface1 interface1) {
        interface1.method1();
    }
    public void depend4(Interface3 interface1) {
        interface1.method4();
    }
    public void depend5(Interface3 interface1) {
        interface1.method5();
    }
}