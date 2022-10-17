/**
 * @class: Employee
 *
 * @author BoFukun
 *
 * @date 2022/10/14 10:00
 *
 */
package cn.bfk.course.assignment;

abstract class Employee implements Comparable<Employee> {     //定义Employee类并实现Comparable接口

    private int ID;

    private String name;

    private double salary = 0;

    Employee(int ID, String name, double salary) {                  //构造器
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }


    public int getID(){
        return this.ID;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public abstract double getMonthlyPay();

    @Override
    public String toString() {                      //覆写toString方法
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee other){           //覆写compareTo方法
        return Integer.compare(this.ID,other.ID);
    }
}
