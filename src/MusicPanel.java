import javax.swing.*;

/**
 * Created by JoseRojas on 7/3/17.
 */
public class MusicPanel extends JPanel{

    public MusicPanel(){

        JRadioButton musicOn = new JRadioButton("On");
        JRadioButton musicOff = new JRadioButton("Off");
        JLabel musicLabel = new JLabel("Music:");

        add(musicLabel);
        add(musicOn);
        add(musicOff);

        ButtonGroup musicGroup = new ButtonGroup();
        musicGroup.add(musicOn);
        musicGroup.add(musicOff);

    }


}
