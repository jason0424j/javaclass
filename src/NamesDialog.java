/**
 * Created by jason chou on 2016/11/8.
 */import javax.swing.JOptionPane;
public class NamesDialog {
    public static void main(String[] arges)
    {
        String firstName;
        String middleName;
        String lastName;
        // Get the user's first name.
        firstName =
                JOptionPane.showInputDialog("What is " +"your first name? ");

        // Get the user's last name.
        lastName =
                JOptionPane.showInputDialog("What is " + "your last name? ");

        // Display a greeting
        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName );



    }
}
