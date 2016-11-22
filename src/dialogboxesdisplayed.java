import javax.swing.*;
import java.util.Scanner;
import java.awt.*;

/**
 * Created by jason chou on 2016/11/15.
 */
public class dialogboxesdisplayed {
    public static void main(String[] arges)
    {
        String Name;
        String Hours;
        String HourlyPayRate;
        int hoursnumber;
        int rate;
        int result;
        JTextPane bigPanel = new JTextPane();
        bigPanel.setSize(new Dimension(800, 100));
        bigPanel.setPreferredSize(new Dimension(800, 100));

        Name =
                JOptionPane.showInputDialog(null, bigPanel,"What is "+"your name?");

        Hours =
                JOptionPane.showInputDialog(null, bigPanel,"how many houes "+"did you work this week?");

        HourlyPayRate =
                JOptionPane.showInputDialog(null, bigPanel,"what is your "+"hourly pay rate?");
        hoursnumber = Integer.parseInt(Hours);
        rate = Integer.parseInt(HourlyPayRate);
        result = (hoursnumber*rate);


        System.out.println("hello "+Name+" your gross pay is "+result);

        JOptionPane.showMessageDialog(null, "hello "+Name+" your gross pay is "+result);

        bigPanel.setSize(new Dimension(800, 100));
        bigPanel.setPreferredSize(new Dimension(800, 100));

        JOptionPane.showMessageDialog(null, bigPanel, "Title", JOptionPane.INFORMATION_MESSAGE);

    }
}
