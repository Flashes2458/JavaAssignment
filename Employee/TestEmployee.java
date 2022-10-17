package cn.bfk.course.assignment;

public class TestEmployee {
    public static void main(String[] args) {

        SalesEmployee Tony = new SalesEmployee(100023,"Tony Tomas",20000, 50000);
        SalesEmployee Niko = new SalesEmployee(100012, "Niko Helens",25000,40000);

        Manager Dwight = new Manager(100001,"Dwight Lowrance",30000, 150000);

        System.out.println(Tony.toString());
        System.out.println(Tony.getMonthlyPay());

        System.out.println(Niko.toString());
        System.out.println(Niko.getMonthlyPay());

        System.out.println(Niko.compareTo(Tony)==1?"Tony earlier than Niko":"Niko earlier than Tony");

        System.out.println(Dwight.toString());
        System.out.println(Dwight.getMonthlyPay());

    }
}
