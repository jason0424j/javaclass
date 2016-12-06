import java.util.*;
/**
 * Created by jason chou on 2016/12/6.
 */
public class javahomework {
    public static void main(String[] args)
    {
    int i;
        int input;
    double total = 1;


    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter number(lesser than 20):");
    input = scanner.nextInt();

    for( i=input;i>=1;i--){
        total = i * total;
    }
    System.out.println(input + "! = " + total);
}
}
