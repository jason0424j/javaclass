import java.util.Scanner;
/**
 * Created by jason chou on 2016/11/29.
 */
public class gradeandcolor {
    public static void main(String[] args)
    {
        int grade;
        String color;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your grade.");
        grade = keyboard.nextInt();

        switch(grade)
        {
            case 9:
                color = "blue";
                break;
            case 8:
                color = "red";
                break;
            case 7:
                color = "yellow";
                break;
            default:
                color = "whote";
                break;




        }
        System.out.println("your color is " + color);
    }
}
