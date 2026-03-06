package sms;   
//import javax.swing.UnsupportedLookAndFeelException;
import ui.loginpage;
public class SMS {
    public static void main(String[] args) {
 
        // Launch the LoginPage
        java.awt.EventQueue.invokeLater(() -> {
            new loginpage().setVisible(true);
        });
    }


}