/**
 * Created by jason chou on 2016/11/7.
 */import java.util.Scanner;
public class Test_2 {
    public static void main(String[] args){
    double radius;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Radius: ");
    radius = scanner.nextDouble();

    System.out.println("Perimeter is = " + (radius*2*Math.PI));
    System.out.println("Area is = " + (Math.PI*(Math.pow(radius, 2))));
}
}

