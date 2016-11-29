import java.util.Scanner;
/**
 * Created by jason chou on 2016/11/29.
 */
public class logicaland {
    public static void main(String[] args)
    {
        int salary;
        int yearsonjob;
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your annual salary.");
        salary = scanner.nextInt();

        System.out.println("Enter the number of years at your current job.");
        yearsonjob = scanner.nextInt();

        System.out.println("Enter your age.");
        age = scanner.nextInt();

        if (salary >= 30000 && (yearsonjob >= 2 || age >=20))
        {
            System.out.println("you qualify for the loan.");
        }else
            {
                System.out.println("you do not qualify for the loan.");

        }

    }
}
