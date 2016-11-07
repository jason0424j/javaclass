/**
 * Created by jason chou on 2016/11/7.
 */import java.util.Scanner;
public class Test_1 {
    public static void main(String[] args){
    int number1;
    int number2;

    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    System.out.println("Input first number: ");
    number1 = input1.nextInt();
    System.out.println("Input seccond number: ");
    number2 = input2.nextInt();

    System.out.println("output:");
    System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
    System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
    System.out.println(number1 + " x " + number2 + " = " + (number1*number2));
    System.out.println(number1 + " / " + number2 + " = " + (number1/number2));
    System.out.println(number1 + " mod " + number2 + " = " + (number1%number2));
}
}


