package com.sen.design.pattern.iterator;

import javax.lang.model.element.VariableElement;
import java.util.Optional;

/**
 * @Auther: Sen
 * @Date: 2019/11/16 22:34
 * @Description: 迭代器模式
 */
public class Client {

    public static void main(String[] args) {
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        OutputImpl output = new OutputImpl(computerCollege);
        output.printCollege();
        output.printDepartment();
        System.out.println();
        OutputImpl output1 = new OutputImpl(infoCollege);
        output1.printCollege();
        output1.printDepartment();
    }
}
