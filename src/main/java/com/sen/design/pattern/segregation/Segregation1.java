package com.sen.design.pattern.segregation;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 00:23
 * @Description:接口隔离原则(对不需要的接口方法进行拆分)
 */
public class Segregation1 {

    public static void main(String[] args) {

    }
}

interface Interface1 {
    void method1();
    void method2();
    void method3();
    void method4();
    void method5();
}

class B implements Interface1{

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

    @Override
    public void method4() {
        System.out.println("B 实现了method4");
    }

    @Override
    public void method5() {
        System.out.println("B 实现了method5");
    }
}

class D implements Interface1{
    @Override
    public void method1() {
        System.out.println("D 实现了method1");
    }

    @Override
    public void method2() {
        System.out.println("D 实现了method2");
    }

    @Override
    public void method3() {
        System.out.println("D 实现了method3");
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
    public void depend2(Interface1 interface1) {
        interface1.method2();
    }
    public void depend3(Interface1 interface1) {
        interface1.method3();
    }
}

class C{
    public void depend3(Interface1 interface1) {
        interface1.method3();
    }
    public void depend4(Interface1 interface1) {
        interface1.method4();
    }
    public void depend5(Interface1 interface1) {
        interface1.method3();
    }
}