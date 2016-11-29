import java.util.Scanner;

/**
 *
 * Created by jason chou on 2016/11/24.
 */
public class homework3 {
    public static void main(String[] args)
    {
        int quantity;
        String noun;
        String input;
        int lenWord;
        char endChar;
        String nound;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter noun");
        noun = scanner.nextLine();

        System.out.println("enter quantity");
        quantity = scanner.nextInt();

        lenWord = noun.length();
        endChar = noun.charAt(lenWord-1);

if(quantity>1) {
if (endChar == 'f') {
System.out.println(quantity + " " + noun.substring(0, lenWord - 1) + "ves");
} else {
if (endChar == 'h') {
System.out.println(quantity + " " + noun.substring(0, lenWord) + "es");
} else {
if (endChar == 'x') {
System.out.println(quantity + " " + noun.substring(0, lenWord) + "es");
} else {
if (endChar == 'y') {
System.out.println(quantity + " " + noun.substring(0, lenWord - 1) + "ies");
} else {
if(endChar =='o') {
System.out.println(quantity + " " + noun.substring(0, lenWord) + "es");
}else{
System.out.println(quantity + " " + noun.substring(0, lenWord - 1) + "s");
}
}
}
}
}
}

}
}

