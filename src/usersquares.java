import java .util.Scanner;
/**
 * Created by jason chou on 2016/12/6.
 */
public class usersquares {
    public static void main(String[] arges)
{
    int number;
    int maxValue;

    System.out.println("i will display a table of "+"numbers and their squares.");
    Scanner keyboard = new Scanner(System.in);
    System.out.print("how high should i go? ");
    maxValue = keyboard.nextInt();

    System.out.println("number    number Squared");
    System.out.println("-------------");
    for (number = 1; number * number<= maxValue; number++)
    {
        System.out.println(number + "\t\t" + number * number);
    }
}
}
