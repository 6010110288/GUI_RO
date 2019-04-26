import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewGame extends JFrame{
    private String name;
    private Boolean run;
    public NewGame(){
        
        super("Ragnarok");
        run = false;
        ImageIcon bgImage = new ImageIcon("./Image/Background.jpg");
        ImageIcon iconImage = new ImageIcon("./Image/poring.png"); 
        ImageIcon logoImage = new ImageIcon("./Image/Ragnarok.gif");
        JLabel bgLabel = new JLabel(bgImage);
        JLabel logoLabel = new JLabel(logoImage);
        setContentPane(bgLabel);
        logoLabel.setBounds(0, 0, 300, 200);
        add(logoLabel);

        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Who are you 'ADVENTURE'?"));
        titlePanel.setBounds(50, 270, 200, 25);
        add(titlePanel);
        

        JTextField getNameField = new JTextField("Enter Character Name");
        getNameField.setHorizontalAlignment(JTextField.CENTER);
        getNameField.setBounds(50, 300, 200, 20);
        add(getNameField);

        JButton newGameButton = new JButton("Start Game");
        newGameButton.setBounds(50, 330, 200, 30);
        add(newGameButton);
        newGameButton.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e){  
                if(getNameField.getText().equals("Enter Character Name"))
                    name = "Annonimous";
                else
                    name = getNameField.getText();
                name = getName();
                run = true;
                dispose();
            }
        } );

        setIconImage(iconImage.getImage());
        setSize(300, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
    }
    public String getName(){
        return name;
    }
    public Boolean isGameStart(){
        return run;
    }
}