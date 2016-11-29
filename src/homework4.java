import java.util.Scanner;
/**
 * Created by jason chou on 2016/11/28.
 */
public class homework4
{
    public static void main(String[] args)
{
    String input;
    Double distance;

    Scanner scanner = new Scanner(System.in);

    System.out.println("enter medium(air/water/steel): ");
    input = scanner.nextLine();

    System.out.println("enter distance: ");
    distance = scanner.nextDouble();

    if(input.equalsIgnoreCase("AIR")){
        System.out.format("time is %2.2f ", distance/1100);
    }else if(input.equalsIgnoreCase("WATER")){
        System.out.println("time: " + distance/4900);
    }else if(input.equalsIgnoreCase("STEEL")){
        System.out.println("time: " + distance/16400);
    }else{
        System.out.println("please enter the correct information");
    }
}
}
