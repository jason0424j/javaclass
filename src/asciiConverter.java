import java.util.Scanner;
/**
 * import java.util.Sca
 * Created by jason chou on 2016/10/25.
 * this program converts a number given by the user into ascii code
 */
public class asciiConverter {

        public static void main(String[] args)
        {Scanner keyboard = new Scanner(System.in);
            byte x;
            System.out.print("Enter a value between byte -127 to 127 ");
            x = keyboard.nextByte();
            char b =(char) x;
            System.out.print("The ascii code for your number "+x+" is "+b);



        }
    }
