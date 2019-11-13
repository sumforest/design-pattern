package com.sen.design.pattern.ocp.improve;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 02:27
 * @Description: 开闭原则：面向扩展开放，面向修改关闭
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEdit graphicEdit = new GraphicEdit();
        graphicEdit.drawShape(new Rectangle());
        graphicEdit.drawShape(new Circle());
        graphicEdit.drawShape(new Triangle());
        graphicEdit.drawShape(new OtherShape());
    }
}

/**
 * 画图类
 * 把shape做成抽象类，让子类去实现抽象其方法
 */
class GraphicEdit {
    void drawShape(Shape shape) {
        shape.drawShape();
    }
}

abstract class Shape {
    abstract void drawShape();
}

class Rectangle extends Shape {

    @Override
    void drawShape() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {

    @Override
    void drawShape() {
        System.out.println("绘制圆形");
    }
}

class Triangle extends Shape {

    @Override
    void drawShape() {
        System.out.println("绘制三角形");
    }
}

class OtherShape extends Shape {
    @Override
    void drawShape() {
        System.out.println("绘制其他图形");
    }
}