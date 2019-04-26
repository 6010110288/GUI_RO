import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GameDisplay extends JFrame{
    private String name;
    private Boolean run;
    private int monsterCount;
    private RandomMoster randomMoster;
    private Monster monster;
    public GameDisplay(PlayerCharacter player){
        super("Ragnarok");
        run = false;
        setLayout(new BorderLayout());
        
        ImageIcon iconImage = new ImageIcon("./Image/poring.png"); 
        ImageIcon jobIconImage = new ImageIcon(player.getIcon());
        
        JLabel jobIconLabel = new JLabel(jobIconImage);
        jobIconLabel.setBounds(0, 0, 200, 200);
        jobIconLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        leftPanel.setBounds(0,0,200,500);
        leftPanel.add(jobIconLabel);
        
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        centerPanel.setBounds(0,0,400,500);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        buttonPanel.setBounds(0,0,300,300);

        
        JPanel statusPanel = new JPanel();
        statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.Y_AXIS));
        statusPanel.setBounds(0, 0, 200, 100);
        statusPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel nameLabel = new JLabel("Name :"+player.getName());
        JLabel jobLabel = new JLabel("Job :"+player.getJob());
        JLabel levelLabel = new JLabel("Level :"+player.getLevel());
        JLabel atkLabel = new JLabel("Attack:"+player.getAttackPoint());
        JLabel hpLabel = new JLabel("HP: "+player.getHealthPoint()+"/"+player.getMaxHealthPoint());
        JLabel expLabel = new JLabel("EXP: "+player.getExperience()+"/"+player.getLevelUpExperiences());
        monsterCount = 0;
        JLabel monsterKilled = new JLabel("Monster Killed: "+ monsterCount);
        randomMoster = new RandomMoster();
        JLabel monsterFront = new JLabel("Name: unknow");
        monsterFront.setHorizontalAlignment((int)(CENTER_ALIGNMENT));
        JLabel monsterLeft = new JLabel("Name: unknow");
        JLabel monsterRight = new JLabel("Name: unknow");
        
        JButton moveButton = new JButton("MOVE");
        JButton attackFrontButton = new JButton("ATTACK");
        JButton attackRighButton= new JButton("ATTACK");
        JButton attackLeftButton = new JButton("ATTACK");
        JButton testButton = new JButton("TEST");
        moveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){  
                nameLabel.setText("Name :"+player.getName());
                jobLabel.setText("Job :"+player.getJob());
                levelLabel.setText("Level :"+player.getLevel());
                atkLabel.setText("Attack:"+player.getAttackPoint());
                hpLabel.setText("HP: "+player.getHealthPoint()+"/"+player.getMaxHealthPoint());
                expLabel.setText("EXP: "+player.getExperience()+"/"+player.getLevelUpExperiences());
                monsterKilled.setText("Monster Killed: "+ monsterCount);
                monster = randomMoster.getRandomMonster();
                if(monster == null)
                    monsterFront.setText("Name: unknow");
                else
                    monsterFront.setText("Name: "+ monster.getName());
                monster = randomMoster.getRandomMonster();
                if(monster == null)
                    monsterLeft.setText("Name: unknow");
                else
                    monsterLeft.setText("Name: "+ monster.getName());
                monster = randomMoster.getRandomMonster();
                if(monster == null)
                    monsterRight.setText("Name: unknow");
                else
                    monsterRight.setText("Name: "+ monster.getName());
                player.regentHealthPoint();
            }
        } );
        testButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){  
                player.damage(5);
                player.gianExperience(20);
                monsterCount++;
                nameLabel.setText("Name :"+player.getName());
                jobLabel.setText("Job :"+player.getJob());
                levelLabel.setText("Level :"+player.getLevel());
                atkLabel.setText("Attack:"+player.getAttackPoint());
                hpLabel.setText("HP: "+player.getHealthPoint()+"/"+player.getMaxHealthPoint());
                expLabel.setText("EXP: "+player.getExperience()+"/"+player.getLevelUpExperiences());
                monsterKilled.setText("Monster Killed: "+ monsterCount);
            }
        } );
        buttonPanel.add(moveButton, BorderLayout.CENTER);
        buttonPanel.add(attackFrontButton, BorderLayout.NORTH);
        buttonPanel.add(attackLeftButton, BorderLayout.WEST);
        buttonPanel.add(attackRighButton, BorderLayout.EAST);
        buttonPanel.add(testButton, BorderLayout.SOUTH);

        centerPanel.add(buttonPanel, BorderLayout.CENTER);
        centerPanel.add(monsterFront, BorderLayout.NORTH);
        centerPanel.add(monsterLeft, BorderLayout.WEST);
        centerPanel.add(monsterRight, BorderLayout.EAST);

        statusPanel.add(nameLabel);
        statusPanel.add(jobLabel);
        statusPanel.add(levelLabel);
        statusPanel.add(atkLabel);
        statusPanel.add(hpLabel);
        statusPanel.add(expLabel);
        statusPanel.add(monsterKilled);

        leftPanel.add(statusPanel);
        add(centerPanel, BorderLayout.CENTER);
        add(leftPanel, BorderLayout.WEST);
        
        setIconImage(iconImage.getImage());
        setSize(600, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
    }
    public String getName(){
        System.out.println(name);
        return name;
    }
    public Boolean isGameStart(){
        return run;
    }

}
