package snakegame;
import javax.swing.*;
public class SnakeGame extends JFrame {

    SnakeGame(){
        super("Snake Game");//it must be first statement
        add(new Board());
        pack();//changes to reflect on screen

        setLocationRelativeTo(null);
        setResizable(false);
    }
    public static void main(String[] args){
        new SnakeGame().setVisible(true);

    }
}
