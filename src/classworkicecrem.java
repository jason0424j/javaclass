import java.util.Scanner;

/**
 * Created by jason chou on 2016/11/22.
 */
public class classworkicecrem {
    public static void main(String[] args) {
        int userflavor;
        int usersize;
        int usercookie;
        int flavor;
        int size;
        int cookie;
        int price;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What want?(Type 1:Vanilla/2:Strawberry/Type anything else for Chocolate)");
        userflavor = scanner.nextInt();

        System.out.println("What size of the ice cream do you want?(1:Big/2:Medium/Type anything else for Small)");
        usersize = scanner.nextInt();

        System.out.println("do you want cookies?(1:yes/Type anything else for no)");
        usercookie = scanner.nextInt();
        //if statement for flavors

        if (userflavor == 1) {
            flavor = 60;
        } else {
            if (userflavor == 2) {
                flavor = 80;
            } else {
                flavor = 70;
            }
        }
        //if statement for size
        if (usersize == 1) {
            size = 40;
        } else {
            size = 20;
        }
        if (usersize == 2) {
            size = 20;
        } else {
            size = 0;
        }
        //if statement for cookie
        if (usercookie == 1) {
            cookie = 10;
        } else {
            cookie = 0;
        }
        price=flavor+size+cookie;
        System.out.print("what is the price" + price);

    }
}


