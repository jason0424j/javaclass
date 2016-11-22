/**
 * Created by jason chou on 2016/11/17.
 */
import java.util.*;
import javax.swing.JOptionPane;
public class homework {
    public static void main(String[] args){
        String name;
        int age;
        double annualPay;

        name = "Jason";
        age = 17;
        annualPay = 10000;

        System.out.println("My name is" + name + ", my age is " + age + " and I hope to earn $" + annualPay +" per year.");

        JOptionPane.showMessageDialog(null, "My name is" + name + ", my age is " + age + " and I hope to earn $" + annualPay +" per year.");
    }
}
