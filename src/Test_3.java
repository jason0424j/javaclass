/**
 * Created by jason chou on 2016/11/7.
 */import java.util.Scanner;
public class Test_3 {
        public static void main(String[] args){
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        number = scanner.nextInt();

        for(int i=0;i<11;i++){
            System.out.println(number + "x" + i + "=" + (number*i));
        }
    }
}

