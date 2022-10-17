package cn.bfk.course.assignment;

public class SalesEmployee extends Employee {

    private double profit = 0;

    SalesEmployee(int ID, String name,double salary, double profit){
        super(ID,name,salary);
        this.profit = profit;
    }

    public double getProfit(){
        return profit;
    }

    @Override
    public String toString(){
        return "SalesEmployee{" +
                "ID=" + getID() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", profit=" + profit +
                '}';
    }

    public double getMonthlyPay(){
        return getSalary() + profit*0.2;
    }
}
