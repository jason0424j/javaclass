import java.util.Scanner;
/**
 * Created by jason chou on 2016/12/1.
 */
public class switchpractice {
    public static void main(String[] args)
    {
        String letergrade;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the leter grade:");
        letergrade = keyboard.nextLine();

        switch(letergrade)
        {
            case  "a":
            case "A":
                letergrade = "good job";
                break;
            case "b":
            case "B":
                letergrade = "keep improving";
                break;
            case "c":
            case "C":
                letergrade = "sleep more";
                break;
            case "d":
            case "D":
                letergrade = "you can do better";
                break;
            default:
                letergrade = "nothing to do here";

        }
        System.out.println("the leter grade is:" + letergrade);
    }
}
