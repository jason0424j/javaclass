import java .util.Scanner;
/**
 * Created by jason chou on 2016/12/6.
 */
public class array {
    public static void main(String[] arges)
    {
        int [] age = new int[5];
        int i;
        Scanner keyboard = new Scanner(System.in);
        for (i = 0; i<5; i++)
        {
            System.out.println("enter age of student #" +(i+1));
            age [i] = keyboard.nextInt();
        }
        for (i = 0; i<5; i++)
        {
            System.out.println("age of student #" + (i + 1)+" is" +age[i]);
        }
    }

}
