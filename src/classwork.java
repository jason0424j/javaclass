import java.util.Scanner;

/**
 * Created by jason chou on 2016/11/17.
 */
public class classwork {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your age");
        age = scanner.nextInt();
        if(age>18){
            System.out.print("welcome");
        }else{
            System.out.print("Access denied");
        }
}
}
