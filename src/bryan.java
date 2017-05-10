import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bryan on 5/9/2017.
 */
public class bryan {
    private JTextField textField1;
    private JButton clickMeButton;
    private JButton clickMe2Button;
    public void  bryan() {
        JTextField textField1 = new JTextField();
        JButton clickMeButton= new JButton();
        JButton clickMe2Button= new JButton();

        JFrame frame =  new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);}

    public  bryan() {


        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {

                if (e.getSource().equals(clickMeButton)) {
                    System.out.println("The button was clicked ");
                } else {
                    System.out.println("The button was  not clicked ");
                }
            }

            }
        );
    }

}
