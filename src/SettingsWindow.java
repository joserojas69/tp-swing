import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoseRojas on 6/3/17.
 */
public class SettingsWindow extends JFrame {
    public SettingsWindow(){
        setTitle("Settings");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);

        JPanel buttonPanel = new JPanel();
        add(buttonPanel);

        JButton back = new JButton("Back");
        buttonPanel.add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow returnB = new MainWindow();
                hide();
            }
        });
    }
}