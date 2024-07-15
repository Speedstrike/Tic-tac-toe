import javax.swing.*;
import java.awt.*;

public class Endscreen {
    protected final JFrame endFrame;
    protected final JPanel endPanel;
    protected final JLabel endLabel;
    protected final JButton endButton;
    public Endscreen() {
        this.endFrame = new JFrame("Endscreen");
        this.endFrame.setSize(Game.screenWidth, Game.screenHeight);
        this.endFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.endFrame.setVisible(true);

        this.endPanel = new JPanel();
        this.endPanel.setSize(Game.screenWidth, Game.screenHeight);
        this.endFrame.add(this.endPanel);

        this.endLabel = new JLabel();
        this.endLabel.setFont(new Font("Times new Roman", Font.PLAIN, 32));
        this.endPanel.add(this.endLabel);

        this.endButton = new JButton();
        this.endButton.setText("Play again");
        this.endButton.setBounds(500, 500, Game.screenWidth / 2, Game.screenHeight / 2);
        this.endButton.addActionListener(e -> {Main.runNewGame();});
        this.endPanel.add(this.endButton);
    }
}
