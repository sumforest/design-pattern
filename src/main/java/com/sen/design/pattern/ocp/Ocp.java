package com.sen.design.pattern.ocp;

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
    }
}

/**
 * 画图类
 * 当需要新增绘制得图形时,需要修改多处代码，违反开闭原则
 */
class GraphicEdit {
    void drawShape(Shape shape) {
        if (shape.grahicType == 1) {
            drawRectangle();
        } else if (shape.grahicType == 2) {
            drawCircle();
        } else if (shape.grahicType == 3) {
            drawTriangle();
        }
    }
    void drawRectangle() {
        System.out.println("绘制矩形");
    }

    void drawCircle() {
        System.out.println("绘制圆形");
    }

    void drawTriangle() {
        System.out.println("绘制三角形");
    }
}

class Shape {
    int grahicType;
}

class Rectangle extends Shape {

    Rectangle() {
        this.grahicType = 1;
    }
}

class Circle extends Shape {
    Circle() {
        this.grahicType = 2;
    }
}

class Triangle extends Shape {
    Triangle(){
        this.grahicType = 3;
    }
}