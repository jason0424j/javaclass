/**
 * Created by jason chou on 2016/11/1.
 */import java.util.Scanner;
public class maxheartrate {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int userAge; //user age
        int userMaxHR; //Max heart rate
        System.out.print("Enter your age");
        userAge = keyboard.nextInt();
        userMaxHR = 220 - userAge;
        System.out.print("your maximun Heart rate is ="+userMaxHR);
    }

    {
        Scanner keyboard = new Scanner(System.in);
        double a; // coefficient of quadratic term
        double b; // coefficient of linear term
        double c; //constant term
        double x1;
        double x2;
        System.out.print("Enter a,b,c values separated by enter");
        a = keyboard.nextDouble();
        b = keyboard.nextDouble();
        c = keyboard.nextDouble();
        x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.print("x1 and x2 are="+x1  + ", " + x2);


    }


}
