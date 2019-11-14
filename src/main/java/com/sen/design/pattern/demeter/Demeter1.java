package com.sen.design.pattern.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Sen
 * @Date: 2019/11/14 14:40
 * @Description: 迪米特法则:最少知道原则
 *  直接朋友：出现在成员变量、方法参数、方法返回值
 */
public class Demeter1 {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployees(new CollegeManager());
    }
}

/**
 * 学校员工
 */
class Employee{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

/**
 * 学院员工
 */
class CollegeEmployee{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class CollegeManager {
    public List<CollegeEmployee> getCollegeEmployee() {
        List<CollegeEmployee> collegeEmployees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId(i);
            collegeEmployees.add(collegeEmployee);
        }
        return collegeEmployees;
    }
}
class SchoolManager{
    public List<Employee> getSchoolEmployee() {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId(i);
            employees.add(employee);
        }
        return employees;
    }

    /**
     * collegeEmployee不是School的直接朋友，违反了迪米特法则
     * 改进：将collegeEmployee封装成一个public方法
     * @param collegeManager
     */
    void printAllEmployees(CollegeManager collegeManager) {
        List<CollegeEmployee> collegeEmployees = collegeManager.getCollegeEmployee();
        for (CollegeEmployee collegeEmployee : collegeEmployees) {
            System.out.println("学院员工" + collegeEmployee.getId());
        }
        System.out.println("=============================================");
        List<Employee> schoolEmpoyee = getSchoolEmployee();
        for (Employee employee : schoolEmpoyee) {
            System.out.println("学校员工" + employee.getId());
        }
    }
}