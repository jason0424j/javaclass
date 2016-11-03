/**
 * Created by jason chou on 2016/11/3.
 */import java.util.Scanner;
public class overscorejava
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double g; //over all grade
        double t; // test
        double p; //programs
        double hw; // homework
        System.out.print("enter your test score");
        t = keyboard.nextDouble();
        System.out.print("entr your programs score");
        p = keyboard.nextDouble();
        System.out.print("enter your homework score");
        hw = keyboard.nextDouble();
        g = (0.3*t+0.3*p+0.4*hw);
        System.out.print("the result of overall grade is"+g);



    }
}

