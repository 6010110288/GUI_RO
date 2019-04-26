import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main{
    private static boolean run = false;
    private static String name;
    public static void main(String[] arg){
        NewGame gameStart  = new NewGame();
        gameStart.setVisible(true);
        while(!run){
            name = gameStart.getName();
            run = gameStart.isGameStart();
        }
        PlayerCharacter player = new Novice(name);
        GameDisplay gameDisplay = new GameDisplay(player);
        while(run){
            player.levelUp();
            System.out.println("");
            if(player.getLevel() >= 10){
                run = false;
                gameDisplay.dispose();
            }
        }
        run = true;
        player = new Swordman(name);
        gameDisplay = new GameDisplay(player);
        while(run){
            player.levelUp();
            System.out.println("");
        }
        gameDisplay.dispose();
        
    }
}