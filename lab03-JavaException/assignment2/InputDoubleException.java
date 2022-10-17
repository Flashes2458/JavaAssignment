package lab03.Assignment;

/**
 * 异常类，输出异常信息
 *
 * @author Fukun Bo
 *
 * @date Oct 17 2022
 */
public class InputDoubleException extends RuntimeException{
    String message;
    public InputDoubleException(){
        message = "输入有误，请输入double类型";
    }
    public String toString(){
        return message;
    }
}
