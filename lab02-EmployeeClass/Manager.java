package cn.bfk.course.assignment;

public class Manager extends Employee{

    double bonus = 0;

    Manager(int ID, String name,double salary, double bonus){
        super(ID,name,salary);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public double getMonthlyPay(){
        return getSalary() + bonus;
    }

    @Override
    public String toString(){
        return "Manager{" +
                "ID=" + getID() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", bonus=" + bonus +
                '}';
    }

}
