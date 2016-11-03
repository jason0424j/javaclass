/**
 * Created by jason chou on 2016/11/3.
 */import java.util.Scanner;
public class solvemathproblem
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double y;
        double x;
        System.out.print("enter x, values separated by enter ");
        x = keyboard.nextDouble();
        y= (3*x*x+5*x+5);
        System.out.print("the result of the equation is"+y);
    }
}
