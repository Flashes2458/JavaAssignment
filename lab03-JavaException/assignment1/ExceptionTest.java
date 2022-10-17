package lab03.Assignment;

import java.util.Scanner;

/**
 * 异常测试类
 *
 * @author Fukun Bo
 *
 * @date Oct 17 2022
 */
public class ExceptionTest {
    public static void main(String[] args) {

        int Math1 = 0;
        int Math2 = 0;

        System.out.println("输入两个整数：");

        Scanner scanner = new Scanner(System.in);
        Math1 = scanner.nextInt();
        Math2 = scanner.nextInt();

        try{
            if(Math1-Math2<=0)

                throw new UnderFlowException(Math1-Math2);

            else if(Math1-Math2>=1000)

                throw new OverFlowException(Math1-Math2);

            else
                System.out.println(Math1-Math2);

        } catch (UnderFlowException e1){

            System.out.println("Value Is Under Err " + e1.getValue());

        } catch (OverFlowException e2){

            System.out.println("Value Is Over Err " + e2.getValue());

        }
    }
}

class OverFlowException extends RuntimeException{

    private int value;

    public OverFlowException(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}

class UnderFlowException extends RuntimeException{

    private int value;

    public UnderFlowException(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}




