import java .util.Scanner;
/**
 * Created by jason chou on 2016/12/8.
 */
public class arrayhomework {
    public static void main(String[] args){
    int i;
    int partialsum = 0;
    int [] age = new int[5];

    Scanner scanner = new Scanner(System.in);
    for(i=0;i<5;i++){
        System.out.println("Enter age " + (i+1) + ":");
        age[i]=scanner.nextInt();
    }
    for(i=0;i<5;i++){
        System.out.println("Student "+  (i+1) + " is " + age[i] +  " years old");
        partialsum+=age[i];
    }
    System.out.println("The average age is " + ((double)partialsum/5));
}
}



