package lab03.Assignment;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 方法：主程序入口，创建Employee对象，输入信息，判断salary是否为double类型，异常抛出，遍历hashmap，写入文件
 *
 * @author Fukun Bo
 *
 * @date Oct 17 2022
 */
public class TestEmployee {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入5组数据创建5个Employee对象：");
        Employee[] employees = new Employee[5];
        int[] IDs = new int[5];
        String[] names = new String[5];
        double[] salaries = new double[5];
        HashMap<String,Employee> hashMap = new HashMap<String,Employee>();

        Scanner scanner = new Scanner(System.in);

        int count = 0;

        for(Employee emp:employees){

            System.out.println("输入第"+(count+1)+"个员工的ID：");
            int id = scanner.nextInt();

            System.out.print("输入第"+(count+1)+"个员工的姓名：");
            String name = new String(scanner.next());

            System.out.print("输入第"+(count+1)+"个员工的工资：");
            String salary = scanner.next() ;
            try{
                //判断是否为double类型
                if(!isNumeric(salary))
                    throw new InputDoubleException();
            }
            catch (InputDoubleException e){
                System.out.println(e);
            }

            employees[count] = new Employee(id,name,Double.valueOf(salary));

            hashMap.put(employees[count].getName(),employees[count]);//将key和value写入hashmap
            count++;
        }

        //遍历hashmap写入文件
        //String filePath = "C:/EmployeeInfo.txt";    //windows11测试会拒绝访问
        String filePath = "D:/EmployeeInfo.txt";      //所以这里改用D盘测试
        File file = new File(filePath);
        Iterator iter = hashMap.entrySet().iterator();
        for(
                Map.Entry<String,Employee>entry: hashMap.entrySet()){
            BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true)));
            // Employee e = entry.getKey();
            bf.write(entry.getKey()+" "+entry.getValue().getSalary()+" \t");
            try{
                bf.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    public static boolean isNumeric(String str){                        //判断字符串是否为double类型，用到了正则表达式
        Pattern pattern = Pattern.compile("[0-9]+[.]?[0-9]*[dD]?");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
}
