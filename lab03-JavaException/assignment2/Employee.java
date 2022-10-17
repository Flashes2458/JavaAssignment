package lab03.Assignment;
/**
 * @class Employee
 *
 * @author BoFukun
 *
 * @date Oct 17 2022
 *
 */
class Employee {     //定义Employee类

    private int ID;

    private String name;

    private double salary = 0;

    Employee(){}

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


    @Override
    public String toString() {                      //覆写toString方法
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
