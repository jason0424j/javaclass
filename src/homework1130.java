import java.util.Scanner;
/**
 * Created by jason chou on 2016/11/30.
 */
public class homework1130 {
    public static void main(String[] args)
    {
        String temp;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the temp");
        temp = keyboard.nextLine();

        switch(temp)
        {
            case "hot":
                temp = "water at 70C";
                break;
            case "cool":
                temp = "water at -70C";
                break;
            case "warm":
                temp = "water at 15C";
                break;
            default:
                temp = "you did not enter the correct option";
                break;
        }
        System.out.println("the temp is " + temp);
    }
}
